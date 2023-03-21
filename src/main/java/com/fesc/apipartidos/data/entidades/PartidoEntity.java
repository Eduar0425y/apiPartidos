package com.fesc.apipartidos.data.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "partido")
@EntityListeners(AuditingEntityListener.class)
@Table(indexes = {
    @Index(columnList = "idPartido", name = "index_idPartido",unique = true)

})
public class PartidoEntity implements Serializable {

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idPartido;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String golesLocal;

    @Column(nullable = false)
    private String golesVisitante;
    
    @CreatedDate
    private Date creado;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuarioEntity;

    @ManyToOne
    @JoinColumn(name = "id_equipolocal")
    private EquipoEntity equipoEntityLocal;

    @ManyToOne
    @JoinColumn(name = "id_equipovisitante")
    private EquipoEntity equipoEntityVisitante;



    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdPartido() {
        return this.idPartido;
    }

    public void setIdPartido(String idPartido) {
        this.idPartido = idPartido;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGolesLocal() {
        return this.golesLocal;
    }

    public void setGolesLocal(String golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getGolesVisitante() {
        return this.golesVisitante;
    }

    public void setGolesVisitante(String golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Date getCreado() {
        return this.creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public UsuarioEntity getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public EquipoEntity getEquipoEntityLocal() {
        return this.equipoEntityLocal;
    }

    public void setEquipoEntityLocal(EquipoEntity equipoEntityLocal) {
        this.equipoEntityLocal = equipoEntityLocal;
    }

    public EquipoEntity getEquipoEntityVisitante() {
        return this.equipoEntityVisitante;
    }

    public void setEquipoEntityVisitante(EquipoEntity equipoEntityVisitante) {
        this.equipoEntityVisitante = equipoEntityVisitante;
    }

}
