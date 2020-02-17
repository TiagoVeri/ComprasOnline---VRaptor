<form action="<c:url value="/produtos/${produto.id }"/>" method="POST">
	<fieldset>
		<legend>Editar Produto</legend>
				
    <label for="nome">Nome:</label>
    <input id="nome" class="required" minlength="3" 
    		type="text" name="produto.nome" 
        	value="${produto.nome }"/>

    <label for="descricao">Descri��o:</label>
    <textarea id="descricao" class="required" maxlength="40" name="produto.descricao">
      ${produto.descricao }
    </textarea>

    <label for="preco">Pre�o:</label>
    <input id="preco" min="0" type="text" name="produto.preco" 
        value="${produto.preco }"/>
				
		<button type="submit" name="_method" value="PUT">Enviar</button>
		
	</fieldset>
</form>