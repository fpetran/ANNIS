package annisservice;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import annisservice.exceptions.AnnisBinaryNotFoundException;
import annisservice.exceptions.AnnisCorpusAccessException;
import annisservice.exceptions.AnnisQLSemanticsException;
import annisservice.exceptions.AnnisQLSyntaxException;
import annisservice.ifaces.AnnisAttributeSet;
import annisservice.ifaces.AnnisBinary;
import annisservice.ifaces.AnnisContingencyTable;
import annisservice.ifaces.AnnisCorpusSet;
import annisservice.ifaces.AnnisResultSet;

@Deprecated
public abstract class AnnisServiceFacade implements AnnisService {

	public abstract AnnisService service();
	
	public AnnisBinary getBinary(Long id) throws RemoteException,
			AnnisBinaryNotFoundException {
		return null;
	}

	public AnnisContingencyTable getContingencyTable(List<Long> corpusList,
			String annisQL, Map<String, String> attributesMap, boolean desc,
			int limit, int offset) throws RemoteException,
			AnnisQLSemanticsException, AnnisQLSyntaxException,
			AnnisCorpusAccessException {
		return service().getContingencyTable(corpusList, annisQL, attributesMap, desc, limit, offset);
	}

	public AnnisCorpusSet getCorpusSet() throws RemoteException {
		return service().getCorpusSet();
	}

	public int getCount(List<Long> corpusList, String annisQL)
			throws RemoteException, AnnisQLSemanticsException,
			AnnisQLSyntaxException, AnnisCorpusAccessException {
		return service().getCount(corpusList, annisQL);
	}

	public AnnisAttributeSet getNodeAttributeSet(List<Long> corpusList,
			boolean fetchValues) throws RemoteException {
		return service().getNodeAttributeSet(corpusList, fetchValues);
	}

	public String getPaula(Long textId) throws RemoteException {
		return service().getPaula(textId);
	}

	public AnnisResultSet getResultSet(List<Long> corpusList, String annisQL,
			int limit, int offset, int contextLeft, int contextRight)
			throws RemoteException, AnnisQLSemanticsException,
			AnnisQLSyntaxException, AnnisCorpusAccessException {
		return service().getResultSet(corpusList, annisQL, limit, offset, contextLeft, contextRight);
	}

	public void ping() throws RemoteException {
		service().ping();
	}

}
