import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medico {
	@Id
	private Long id;
private int telefone;
private String especialidade;
private String nome;
private int crm;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getTelefone() {
	return telefone;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCrm() {
	return crm;
}
public void setCrm(int crm) {
	this.crm = crm;
}
@Override
public String toString() {
	return "Medico [id=" + id + ", telefone=" + telefone + ", especialidade=" + especialidade + ", nome=" + nome
			+ ", crm=" + crm + "]";

}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Medico other = (Medico) obj;
	if (crm != other.crm)
		return false;
	if (especialidade == null) {
		if (other.especialidade != null)
			return false;
	} else if (!especialidade.equals(other.especialidade))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (telefone != other.telefone)
		return false;
	return true;
}}
