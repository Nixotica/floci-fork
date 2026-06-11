package io.github.hectorvent.floci.services.ecs.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.ArrayList;
import java.util.List;

/**
 * Maps to an entry in a {@code DescribeTasks} response's {@code attachments[]} array.
 * For awsvpc tasks the type is {@code "ElasticNetworkInterface"} and {@code details}
 * carries the synthetic ENI's networkInterfaceId, subnetId, privateIPv4Address,
 * privateDnsName, and macAddress so downstream consumers can resolve them via
 * {@code DescribeNetworkInterfaces}.
 */
@RegisterForReflection
public class EcsAttachment {

    private String id;
    private String type;
    private String status;
    private final List<KeyValuePair> details = new ArrayList<>();

    public EcsAttachment() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<KeyValuePair> getDetails() { return details; }
}
