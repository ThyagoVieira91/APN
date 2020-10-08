package br.com.apolo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Lançamentos  implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Banda;
    private String NomeAlbum;
    private Integer faixa;
    private Date dataLançamento;



}
