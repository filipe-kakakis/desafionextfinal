package nextdesafio.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // NOT NULL PrimaryKey
    @Column (nullable = false, length = 30)
    private String primeiroNome; // NOT NULL
    @Column (nullable = false, length = 30)
    private String ultimoNome; // NOT NULL
    @Column (nullable = false, length = 60)
    private String matricula; // NOT NULL
    @Column (nullable = false, length = 30)
    private String atividade; // NOT NULL
    @Column
    private Date dataNascimento; // NOT NULL

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
