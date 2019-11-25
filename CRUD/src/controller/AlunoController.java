package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AlunoDAO;
import model.Aluno;

public class AlunoController {

	public void Create(Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.Create(aluno);
		}
		finally{
			System.out.println("Fim do Inserir");
		}
	}
	public List<Aluno> ReadAll()
	{	List<Aluno> AlunosC =  new ArrayList<Aluno>();
		try{
			AlunoDAO dao = new AlunoDAO();

			AlunosC = dao.readAll();

		}
		finally{
			System.out.println("Fim da Pesquisa");
		}
		return AlunosC;

	}

	public void Delete(Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.Delete(aluno);
		}
		finally{
			System.out.println("Fim do Inserir");
		}
	}

	public void Update(Aluno aluno)
	{
		try
		{
			AlunoDAO dao = new AlunoDAO();
			dao.Update(aluno);
		}
		finally{
			System.out.println("Fim do Inserir");
		}
	}




}