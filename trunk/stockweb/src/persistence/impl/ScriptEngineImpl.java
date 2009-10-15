package persistence.impl;

import java.util.Set;

import persistence.session.ScriptEngineSession;
import persistence.vo.Script;

/**
 * @author: Humberto Rocha Loureiro (humbertorocha@gmail.com)
 * @modify: 
 */

public class ScriptEngineImpl {

	public Script get(Script script) {
		try {
			System.out.println("######################### "
					+ this.getClass().getSimpleName()
					+ "->GET  ########################");
			return new ScriptEngineSession().get(script);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Script getById(Script script) {
		try {
			System.out.println("######################### "
					+ this.getClass().getSimpleName()
					+ "->GET  ########################");
			return new ScriptEngineSession().getById(script);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Set list() {
		try {
			System.out.println("######################### "
					+ this.getClass().getSimpleName()
					+ "->LIST  ########################");
			return new ScriptEngineSession().list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void remove(Script script) {
		try {
			System.out.println("######################### "
					+ this.getClass().getSimpleName()
					+ "->LIST  ########################");
			new ScriptEngineSession().delete(script);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void save(Script script) {
		try {
			System.out.println("######################### "
					+ this.getClass().getSimpleName()
					+ "->SAVE  ########################");
			new ScriptEngineSession().add(script);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
