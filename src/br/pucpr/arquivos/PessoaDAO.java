package br.pucpr.arquivos;

import java.io.*;

public class PessoaDAO {

    public void gravar(Pessoa pessoa) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pessoa.getCpf() + ".bin");
            outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(pessoa);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public Pessoa obterPessoa(String cpf)  {

        ObjectInputStream ois = null;
        FileInputStream fis = null;
        Pessoa pessoa = null;

        try {
            fis = new FileInputStream(cpf + ".bin");
            ois = new ObjectInputStream(fis);

            pessoa = (Pessoa) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return pessoa;
    }

}
