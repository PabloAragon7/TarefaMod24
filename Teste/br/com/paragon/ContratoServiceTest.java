package br.com.paragon;


import br.com.paragon.mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test

    public void salvarTest(){

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);


    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNosalvarTestBancodeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);


    }

    @Test
    public void buscar(){

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Achou", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNobuscarTestBancodeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Achou", retorno);


    }

    @Test
    public void excluir(){

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("excluiu", retorno);

        }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoexcluirTestBancodeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("excluiu", retorno);


    }

    @Test
    public void atualizar(){

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("atualizado", retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoatualizarTestBancodeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("atualizado", retorno);


    }




    }




