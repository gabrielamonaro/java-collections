package ordenacao;

    class Gato implements Comparable<Gato>{
        private String nome;
        private int idade;
        private String cor;
    
        Gato(String nome, int idade, String cor)
        {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        } 
    
        public String getCor() {
            return cor;
        }
        public int getIdade() {
            return idade;
        }
        public String getNome() {
            return nome;
        }
    
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "{"+
                        "nome='" + nome + '\'' +
                        ", idade =" + idade +
                        ", cor='" + cor + '\'' +
                    '}';
        }
    
        @Override
        public int compareTo(Gato gato) {
            // TODO Auto-generated method stub
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }

