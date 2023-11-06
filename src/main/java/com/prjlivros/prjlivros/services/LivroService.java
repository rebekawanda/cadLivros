package com.prjlivros.prjlivros.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.prjlivros.prjlivros.entities.Livro;
import com.prjlivros.prjlivros.repositories.LivroRepository;


	@Service
	public class LivroService {
		private final  LivroRepository livroRepository;

		public LivroService(LivroRepository livroRepository) {
			this.livroRepository = livroRepository;
		}
		//preparando as buscas por id
				public Livro getLivroById(Long id) {
					return livroRepository.findById(id).orElse(null);
				}
				//preparando a busca geral	
				public  List<Livro> getAllLivros(){
					return livroRepository.findAll();
				}
				//salvando o Livro	
				public Livro saveLivro(Livro livro) {
					return livroRepository.save(livro);		
				}
				//excluindo o Livro
				public void deleteLivro(Long id){
					livroRepository.deleteById(id);	
				}	
				// fazendo o update do Livro com o optional
				public Livro updateLivro(Long id, Livro novoLivro) {
			        Optional<Livro> livroOptional = livroRepository.findById(id);
			        if (livroOptional.isPresent()) {
			        	Livro livroExistente = livroOptional.get();
			           	livroExistente.setDescrição(novoLivro.getDescrição());
			        	livroExistente.setIsbn(novoLivro.getIsbn());          
			            return livroRepository.save(livroExistente); 
			        } else {
			            return null; 
			        }
			    }

	}

