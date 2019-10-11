
public class bercario {
private String nome;
private int datadenascimento;
private String endereco;
private int telefone;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getDatadenascimento() {
	return datadenascimento;
}
public void setDatadenascimento(int datadenascimento) {
	this.datadenascimento = datadenascimento;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public int getTelefone() {
	return telefone;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
@Override
public String toString() {
	return "bercario [nome=" + nome + ", datadenascimento=" + datadenascimento + ", endereco=" + endereco
			+ ", telefone=" + telefone + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	bercario other = (bercario) obj;
	if (datadenascimento != other.datadenascimento)
		return false;
	if (endereco == null) {
		if (other.endereco != null)
			return false;
	} else if (!endereco.equals(other.endereco))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (telefone != other.telefone)
		return false;
	return true;
}

}
