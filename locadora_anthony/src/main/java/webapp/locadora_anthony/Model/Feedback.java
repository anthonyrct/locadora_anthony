package webapp.locadora_anthony.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Feedback {
    @Id
    private int id_feedback;
    private String comentario;
    private String avaliacao;
    private Date data_feedback;

    //getters e setters

    public int getId_feedback() {
        return id_feedback;
    }
    public void setId_feedback(int id_feedback) {
        this.id_feedback = id_feedback;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public Date getData_feedback() {
        return data_feedback;
    }
    public void setData_feedback(Date data_feedback) {
        this.data_feedback = data_feedback;
    }
    
}
