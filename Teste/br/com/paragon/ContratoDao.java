package br.com.paragon;

public class ContratoDao implements IContratoDao {


    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");

    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não iojsd com o banco");
    }

    public void excluir(){
        throw new UnsupportedOperationException("Não funciona");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("não atualizado");
    }
}
