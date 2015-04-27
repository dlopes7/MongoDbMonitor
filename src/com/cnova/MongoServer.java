package com.cnova;

public class MongoServer {
	
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

	Double collections;
	Double objects;
	Double dataSize;
	Double storageSize;
	Double numExtents;
	Double indexes;
	Double indexSize;
	Double fileSize;
	Double nsSizeMB;

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
	public Double getCollections() {
		return collections;
	}
	public void setCollections(Double collections) {
		this.collections = collections;
	}
	public Double getObjects() {
		return objects;
	}
	public void setObjects(Double objects) {
		this.objects = objects;
	}
	public Double getDataSize() {
		return dataSize;
	}
	public void setDataSize(Double dataSize) {
		this.dataSize = dataSize;
	}
	public Double getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(Double storageSize) {
		this.storageSize = storageSize;
	}
	public Double getNumExtents() {
		return numExtents;
	}
	public void setNumExtents(Double numExtents) {
		this.numExtents = numExtents;
	}
	public Double getIndexes() {
		return indexes;
	}
	public void setIndexes(Double indexes) {
		this.indexes = indexes;
	}
	public Double getIndexSize() {
		return indexSize;
	}
	public void setIndexSize(Double indexSize) {
		this.indexSize = indexSize;
	}
	public Double getFileSize() {
		return fileSize;
	}
	public void setFileSize(Double fileSize) {
		this.fileSize = fileSize;
	}
	public Double getNsSizeMB() {
		return nsSizeMB;
	}
	public void setNsSizeMB(Double nsSizeMB) {
		this.nsSizeMB = nsSizeMB;
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
	
	public void popularStats(){
		
	}
	
	

}
