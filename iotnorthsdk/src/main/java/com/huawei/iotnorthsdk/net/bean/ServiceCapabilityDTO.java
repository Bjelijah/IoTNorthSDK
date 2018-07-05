package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ServiceCapabilityDTO {
    @SerializedName("serviceId")   String serviceId;
    @SerializedName("serviceType") String servcieType;
    @SerializedName("description") String description;
    @SerializedName("commands")    ArrayList<ServiceCommand> commands;
    @SerializedName("properties")  ArrayList<ServiceProperty> properties;

    @Override
    public String toString() {
        return "ServiceCapabilityDTO{" +
                "serviceId='" + serviceId + '\'' +
                ", servcieType='" + servcieType + '\'' +
                ", description='" + description + '\'' +
                ", commands=" + commands +
                ", properties=" + properties +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServcieType() {
        return servcieType;
    }

    public void setServcieType(String servcieType) {
        this.servcieType = servcieType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<ServiceCommand> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<ServiceCommand> commands) {
        this.commands = commands;
    }

    public ArrayList<ServiceProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ServiceProperty> properties) {
        this.properties = properties;
    }

    public ServiceCapabilityDTO() {

    }

    public ServiceCapabilityDTO(String serviceId, String servcieType, String description, ArrayList<ServiceCommand> commands, ArrayList<ServiceProperty> properties) {

        this.serviceId = serviceId;
        this.servcieType = servcieType;
        this.description = description;
        this.commands = commands;
        this.properties = properties;
    }
}
