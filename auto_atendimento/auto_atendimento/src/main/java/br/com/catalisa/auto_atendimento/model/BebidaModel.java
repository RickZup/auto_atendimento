package br.com.catalisa.auto_atendimento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("BEBIDA")

public class BebidaModel extends ProdutoModel{}
