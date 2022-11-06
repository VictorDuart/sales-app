package io.github.VictorDuart.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "cadastre_date", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate cadastreDate;

    @PrePersist
    public void prePersist(){
        setCadastreDate(LocalDate.now());
    }
}
