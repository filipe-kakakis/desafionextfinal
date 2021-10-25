package nextdesafio.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AProjeto {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; // NOT NULL & Primary Key
    @Column (nullable = false, length = 60)
    private String nomeProjeto; ; // NOT NULL
    @Column (nullable = false)
    private String gerente; // FK Id_Usuário
    @Column (nullable = false)
    private Date dataInicio; // DATE NOT NULL
    @Column (nullable = false)
    private Date dataFim; // DATE NOT NULL
    // @Column
    // private String status; // NOT NULL
    // flag enum not null



    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeProjeto() {
        return nomeProjeto;
    }
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
