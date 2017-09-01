package com.dimas.maryanto.perpus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "m_rak", schema = "master")
public class Rak {

    @Id
    @GenericGenerator(name = "gen_rak", strategy = "uuid2")
    @GeneratedValue(generator = "gen_rak")
    private String id;

    @Column(name = "kode_rak", nullable = false, unique = true, length = 10)
    private String kode;

    @Column(nullable = false, length = 100)
    private String nama;
}
