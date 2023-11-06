package com.prjlivros.prjlivros.entities;

	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "db_livro")
	public class Livro {	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String descrição;
		
		private String isbn;
		
		public Livro() {		
		}
		
		public Livro(Long id, String descrição, String isbn) {
			super();
			this.id = id;
			this.descrição = descrição;
			this.isbn = isbn;
		}
		
		//crie os metodos getts e setts	
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getDescrição() {
			return descrição;
		}
		
		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}
		
		public String getIsbn() {
			return isbn;
		}
		
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
	}

