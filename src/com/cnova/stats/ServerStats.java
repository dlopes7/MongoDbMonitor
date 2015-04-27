package com.cnova.stats;

import org.json.JSONObject;

public class ServerStats {
	
	Double currentConnections;
	Double availableConnections;
	Double totalCreatedConnections;

	Double residentMemory;
	Double virtualMemory;
	Double mappedMemory;
	Double mappedWithJournalMemory;

	Double insertOperations;
	Double queryOperations;
	Double updateOperations;
	Double deleteOperations;
	Double getmoreOperations;
	Double commandOperations;

	Double insertReplications;
	Double queryReplications;
	Double updateReplications;
	Double deleteReplications;
	Double getmoreReplications;
	Double commandReplications;
	
	Double bytesIn;
	Double bytesOut;
	Double numRequests;
	
	public Double getCurrentConnections() {
		return currentConnections;
	}
	public void setCurrentConnections(Double currentConnections) {
		this.currentConnections = currentConnections;
	}
	public Double getAvailableConnections() {
		return availableConnections;
	}
	public void setAvailableConnections(Double availableConnections) {
		this.availableConnections = availableConnections;
	}
	public Double getTotalCreatedConnections() {
		return totalCreatedConnections;
	}
	public void setTotalCreatedConnections(Double totalCreatedConnections) {
		this.totalCreatedConnections = totalCreatedConnections;
	}
	public Double getResidentMemory() {
		return residentMemory;
	}
	public void setResidentMemory(Double residentMemory) {
		this.residentMemory = residentMemory;
	}
	public Double getVirtualMemory() {
		return virtualMemory;
	}
	public void setVirtualMemory(Double virtualMemory) {
		this.virtualMemory = virtualMemory;
	}
	public Double getMappedMemory() {
		return mappedMemory;
	}
	public void setMappedMemory(Double mappedMemory) {
		this.mappedMemory = mappedMemory;
	}
	public Double getMappedWithJournalMemory() {
		return mappedWithJournalMemory;
	}
	public void setMappedWithJournalMemory(Double mappedWithJournalMemory) {
		this.mappedWithJournalMemory = mappedWithJournalMemory;
	}
	public Double getInsertOperations() {
		return insertOperations;
	}
	public void setInsertOperations(Double insertOperations) {
		this.insertOperations = insertOperations;
	}
	public Double getQueryOperations() {
		return queryOperations;
	}
	public void setQueryOperations(Double queryOperations) {
		this.queryOperations = queryOperations;
	}
	public Double getUpdateOperations() {
		return updateOperations;
	}
	public void setUpdateOperations(Double updateOperations) {
		this.updateOperations = updateOperations;
	}
	public Double getDeleteOperations() {
		return deleteOperations;
	}
	public void setDeleteOperations(Double deleteOperations) {
		this.deleteOperations = deleteOperations;
	}
	public Double getGetmoreOperations() {
		return getmoreOperations;
	}
	public void setGetmoreOperations(Double getmoreOperations) {
		this.getmoreOperations = getmoreOperations;
	}
	public Double getCommandOperations() {
		return commandOperations;
	}
	public void setCommandOperations(Double commandOperations) {
		this.commandOperations = commandOperations;
	}
	public Double getInsertReplications() {
		return insertReplications;
	}
	public void setInsertReplications(Double insertReplications) {
		this.insertReplications = insertReplications;
	}
	public Double getQueryReplications() {
		return queryReplications;
	}
	public void setQueryReplications(Double queryReplications) {
		this.queryReplications = queryReplications;
	}
	public Double getUpdateReplications() {
		return updateReplications;
	}
	public void setUpdateReplications(Double updateReplications) {
		this.updateReplications = updateReplications;
	}
	public Double getDeleteReplications() {
		return deleteReplications;
	}
	public void setDeleteReplications(Double deleteReplications) {
		this.deleteReplications = deleteReplications;
	}
	public Double getGetmoreReplications() {
		return getmoreReplications;
	}
	public void setGetmoreReplications(Double getmoreReplications) {
		this.getmoreReplications = getmoreReplications;
	}
	public Double getCommandReplications() {
		return commandReplications;
	}
	public void setCommandReplications(Double commandReplications) {
		this.commandReplications = commandReplications;
	}
	public Double getBytesIn() {
		return bytesIn;
	}
	public void setBytesIn(Double bytesIn) {
		this.bytesIn = bytesIn;
	}
	public Double getBytesOut() {
		return bytesOut;
	}
	public void setBytesOut(Double bytesOut) {
		this.bytesOut = bytesOut;
	}
	public Double getNumRequests() {
		return numRequests;
	}
	public void setNumRequests(Double numRequests) {
		this.numRequests = numRequests;
	}
	
	public void populateMetrics(JSONObject metricas){

		this.currentConnections =  metricas.getJSONObject("connections").getDouble("current");
		this.availableConnections =  metricas.getJSONObject("connections").getDouble("available");
		this.totalCreatedConnections =  metricas.getJSONObject("connections").getDouble("totalCreated");
		
		this.residentMemory = metricas.getJSONObject("mem").getDouble("resident");
		this.virtualMemory = metricas.getJSONObject("mem").getDouble("virtual");
		this.mappedMemory = metricas.getJSONObject("mem").getDouble("mapped");
		this.mappedWithJournalMemory = metricas.getJSONObject("mem").getDouble("mappedWithJournal");
		
		//Have to convert the value to an Unsigned Integer before reporting.
		this.insertOperations = Double.valueOf(metricas.getJSONObject("opcounters").getInt("insert") & 0x00000000ffffffffL);
		this.queryOperations = Double.valueOf(metricas.getJSONObject("opcounters").getInt("query") & 0x00000000ffffffffL);
		this.updateOperations = Double.valueOf(metricas.getJSONObject("opcounters").getInt("update") & 0x00000000ffffffffL);
		this.deleteOperations = Double.valueOf(metricas.getJSONObject("opcounters").getInt("delete") & 0x00000000ffffffffL);
		this.getmoreOperations = Double.valueOf(metricas.getJSONObject("opcounters").getInt("getmore") & 0x00000000ffffffffL);
		this.commandOperations = Double.valueOf(metricas.getJSONObject("opcounters").getInt("command") & 0x00000000ffffffffL);
		
		this.insertReplications = Double.valueOf(metricas.getJSONObject("opcountersRepl").getInt("insert") & 0x00000000ffffffffL);
		this.queryReplications = Double.valueOf(metricas.getJSONObject("opcountersRepl").getInt("query") & 0x00000000ffffffffL);
		this.updateReplications = Double.valueOf(metricas.getJSONObject("opcountersRepl").getInt("update") & 0x00000000ffffffffL);
		this.deleteReplications = Double.valueOf(metricas.getJSONObject("opcountersRepl").getInt("delete") & 0x00000000ffffffffL);
		this.getmoreReplications = Double.valueOf(metricas.getJSONObject("opcountersRepl").getInt("getmore") & 0x00000000ffffffffL);
		this.commandReplications = Double.valueOf(metricas.getJSONObject("opcountersRepl").getInt("command") & 0x00000000ffffffffL);

		this.bytesIn = metricas.getJSONObject("network").getDouble("bytesIn") / 60.0;
		this.bytesOut = metricas.getJSONObject("network").getDouble("bytesOut") / 60.0;
		this.numRequests = metricas.getJSONObject("network").getDouble("numRequests");
		
	}
	

	

}
