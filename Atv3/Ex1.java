package javateste;
import java.io.*;
import java.util.Arrays;

public class Ex1 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("./data1.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String l = br.readLine();
        

        String [] input = new String[3];
        int i = -1;        
        while(a != null) {
        	i = i + 1;
            input[i] = l;
            l = br.readLine();
        }
        String[] TamanhoSeparado = input[2].split(" ");

        
        int med = 0;
        int result = 0;
        for(int j=0; j < TamanhoSeparado.length; j++) {
        	med += Integer.parseInt(TamanhoSeparado[j]); 
        }
        med = med / Integer.parseInt(input[0]);
        
        while(med > 0) {
        	for(int j=0; j < TamanhoSeparado.length; j++) {
            	result += Integer.parseInt(TamanhoSeparado[j]) / med;
        	}
        	if(result == Integer.parseInt(input[0])) {
        		System.out.println(med);
        		break;
        	}
        	else {
        		med = med - 1;
        		result = 0;
        	}
        }
    }
}