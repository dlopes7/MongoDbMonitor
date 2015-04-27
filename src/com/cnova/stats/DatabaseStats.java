package com.cnova.stats;

import org.json.JSONObject;

public class DatabaseStats {
	
	Double collections;
	Double objects;
	Double dataSize;
	Double storageSize;
	Double numExtents;
	Double indexes;
	Double indexSize;
	Double fileSize;
	Double nsSizeMB;
	
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
	
	public void populateMetrics(JSONObject metricas){
		

		
		this.collections = metricas.getDouble("collections");
		this.objects = metricas.getDouble("objects");
		this.dataSize = metricas.getDouble("dataSize");
		this.dataSize = metricas.getDouble("dataSize");
		this.storageSize = metricas.getDouble("storageSize");
		this.storageSize = metricas.getDouble("storageSize");
		this.numExtents = metricas.getDouble("numExtents");
		this.indexes = metricas.getDouble("indexes");
		this.indexSize = metricas.getDouble("indexSize");
		this.fileSize = metricas.getDouble("fileSize");
		this.nsSizeMB = metricas.getDouble("nsSizeMB");
				
		
	}
	

}
