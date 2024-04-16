package Lista3ex02;

public class Eleicao {
    
    private double VotosCandidatosA;
    private double VotosCandidatosB;
    private double VotosNulos;
    private double VotosBrancos;
    
    public Eleicao(double VotosCandidatosA, double VotosCandidatosB, double VotosNulos, double VotosBrancos) {
        this.VotosCandidatosA = VotosCandidatosA;
        this.VotosCandidatosB = VotosCandidatosB;
        this.VotosNulos = VotosNulos; 
        this.VotosBrancos = VotosBrancos;
    }

    public String getApuracao() {
        double VotosValidos  =  VotosCandidatosA + VotosCandidatosB;
        double VotosNulosOuBrancos = VotosNulos + VotosBrancos;

        if (VotosValidos > VotosNulosOuBrancos) 
            if (VotosCandidatosA > VotosCandidatosB) {
                return "Candidato A eleito!!";

            } else if (VotosCandidatosB > VotosCandidatosA) {
                return "Candidato B eleito!!";

            } else {
                return "Segundo Turno!!";
        
        } else if (VotosValidos == VotosNulosOuBrancos) 
            if (VotosCandidatosA > VotosCandidatosB) {
                return "Candidato A eleito!!";

            } else if (VotosCandidatosB > VotosCandidatosA){
                return "Candidato B eleito!!";

            } else {
                return "Segundo Turno!!";               
            }

        else {
            return "Segundo Turno!!";
        }

        }
    }