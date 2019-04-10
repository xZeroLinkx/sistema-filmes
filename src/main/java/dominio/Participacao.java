package dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class Participacao implements Serializable {
	private static final long serialVersionUID = 1L;
	Integer codParticipacao;
	String personagem;
	BigDecimal desconto;
	Artista artista;
	
	public Participacao() {
		super();
	}

	public Participacao(Integer codParticipacao, String personagem, BigDecimal desconto, Artista artista) {
		super();
		this.codParticipacao = codParticipacao;
		this.personagem = personagem;
		this.desconto = desconto;
		this.artista = artista;
	}

	public Integer getCodParticipacao() {
		return codParticipacao;
	}

	public void setCodParticipacao(Integer codParticipacao) {
		this.codParticipacao = codParticipacao;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codParticipacao == null) ? 0 : codParticipacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participacao other = (Participacao) obj;
		if (codParticipacao == null) {
			if (other.codParticipacao != null)
				return false;
		} else if (!codParticipacao.equals(other.codParticipacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Participacao [codParticipacao=" + codParticipacao + ", personagem=" + personagem + ", desconto="
				+ desconto + ", artista=" + artista + "]";
	}
}
