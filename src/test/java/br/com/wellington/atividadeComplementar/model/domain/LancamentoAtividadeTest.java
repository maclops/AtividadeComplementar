package br.com.wellington.atividadeComplementar.model.domain;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LancamentoAtividadeTest {
	
	private LancamentoAtividade lancamentoAtividade;
	
	@Before
	public void init() {
		lancamentoAtividade = new LancamentoAtividade();
	}
	
	@Test
	public void testePrimeiroSemestre() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.YEAR, 2018);
		lancamentoAtividade.setDataFim(c.getTime());
		String semestre = lancamentoAtividade.getSemestreAtividade();
		Assert.assertEquals(semestre, "2018-1");
	}
	
	@Test
	public void testeSegundoSemestre() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.YEAR, 2018);
		lancamentoAtividade.setDataFim(c.getTime());
		String semestre = lancamentoAtividade.getSemestreAtividade();
		Assert.assertEquals(semestre, "2018-2");
	}
	
	@Test
	public void testeFinalPrimeiroSemestre() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 29);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.YEAR, 2015);
		lancamentoAtividade.setDataFim(c.getTime());
		String semestre = lancamentoAtividade.getSemestreAtividade();
		Assert.assertEquals(semestre, "2015-1");
	}
	
	@Test
	public void testeFinalSegundoSemestre() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.YEAR, 2015);
		lancamentoAtividade.setDataFim(c.getTime());
		String semestre = lancamentoAtividade.getSemestreAtividade();
		Assert.assertEquals(semestre, "2015-2");
	}
	
}
