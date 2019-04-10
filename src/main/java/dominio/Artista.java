package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Artista implements Serializable {
	private static final long serialVersionUID = 1L;
	Integer codAtor;
	String nome;
	String nacionalidade;
	BigDecimal cache;
	Date nascimento;
	List<Participacao> participacoes = new ArrayList<>();
	
	public Artista() {
		super();
	}

	public Artista(Integer codAtor, String nome, String nacionalidade, BigDecimal cache, Date nascimento) {
		super();
		this.codAtor = codAtor;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.cache = cache;
		this.nascimento = nascimento;
	}

	public Integer getCodAtor() {
		return codAtor;
	}

	public void setCodAtor(Integer codAtor) {
		this.codAtor = codAtor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public BigDecimal getCache() {
		return cache;
	}

	public void setCache(BigDecimal cache) {
		this.cache = cache;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAtor == null) ? 0 : codAtor.hashCode());
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
		Artista other = (Artista) obj;
		if (codAtor == null) {
			if (other.codAtor != null)
				return false;
		} else if (!codAtor.equals(other.codAtor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artista [codAtor=" + codAtor + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", cache="
				+ cache + ", nascimento=" + nascimento + ", participacoes=" + participacoes + "]";
	}
}
