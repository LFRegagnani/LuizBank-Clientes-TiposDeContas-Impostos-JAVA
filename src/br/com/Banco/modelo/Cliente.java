package br.com.Banco.modelo;


/** esta classe representa um cliente do banco
 * @author Luiz_
 */

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private static int totalClientes;
    private Conta conta;




    public Cliente(String nome, String cpf, String profissao, Conta conta){//isso é o construtor, existe para mostrar o que é necessario para implementar a classe
        setNome(nome);
        setCpf(cpf);
        setProfissao(profissao);
        setConta(conta);
        conta.setTitular(this);
        Cliente.totalClientes++;
        System.out.println("Um(a) novo(a) cliente foi cadastrado com o nome de "
                + this.nome + " agora o número total de clientes é " + Cliente.totalClientes);
    }

    @Override
    public String toString() {
        return "Cliente "+ this.nome + " CPF " + this.cpf;
    }

    public String getNome(){//mostra o nome em forma de string
        return this.nome;
    }
    public void setNome (String nome){//altera a string nome
        this.nome = nome;
    }
    public String getCpf(){//mostra o cpf em forma de string
        return this.cpf;
    }
    public void setCpf(String cpf){//altera o cpf
        this.cpf = cpf;
    }

    public String getProfissao(){//mostra a profissão em forma de string
        return this.profissao;
    }

    public void setProfissao(String profissao){//altera a profissão
        this.profissao = profissao;
    }

    public void setConta(Conta conta){this.conta=conta;}
    public Conta getConta(){return this.conta;}

}
