package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClientOptions extends ClientOptions {

  private final Optional<Integer> maxConnections;

  private final Optional<Integer> maxConnectionsPerHost;

  private AutoValue_ClientOptions(
      Optional<Integer> maxConnections,
      Optional<Integer> maxConnectionsPerHost) {
    this.maxConnections = maxConnections;
    this.maxConnectionsPerHost = maxConnectionsPerHost;
  }

  @JsonProperty("maxConnections")
  @Override
  public Optional<Integer> maxConnections() {
    return maxConnections;
  }

  @JsonProperty("maxConnectionsPerHost")
  @Override
  public Optional<Integer> maxConnectionsPerHost() {
    return maxConnectionsPerHost;
  }

  @Override
  public String toString() {
    return "ClientOptions{"
        + "maxConnections=" + maxConnections + ", "
        + "maxConnectionsPerHost=" + maxConnectionsPerHost
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ClientOptions) {
      ClientOptions that = (ClientOptions) o;
      return this.maxConnections.equals(that.maxConnections())
          && this.maxConnectionsPerHost.equals(that.maxConnectionsPerHost());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= maxConnections.hashCode();
    h$ *= 1000003;
    h$ ^= maxConnectionsPerHost.hashCode();
    return h$;
  }

  @Override
  public ClientOptions.Builder toBuilder() {
    return new AutoValue_ClientOptions.Builder(this);
  }

  static final class Builder extends ClientOptions.Builder {
    private Optional<Integer> maxConnections = Optional.empty();
    private Optional<Integer> maxConnectionsPerHost = Optional.empty();
    Builder() {
    }
    Builder(ClientOptions source) {
      this.maxConnections = source.maxConnections();
      this.maxConnectionsPerHost = source.maxConnectionsPerHost();
    }
    @Override
    public ClientOptions.Builder maxConnections(Integer maxConnections) {
      this.maxConnections = Optional.of(maxConnections);
      return this;
    }
    @Override
    ClientOptions.Builder maxConnections(Optional<Integer> maxConnections) {
      if (maxConnections == null) {
        throw new NullPointerException("Null maxConnections");
      }
      this.maxConnections = maxConnections;
      return this;
    }
    @Override
    public ClientOptions.Builder maxConnectionsPerHost(Integer maxConnectionsPerHost) {
      this.maxConnectionsPerHost = Optional.of(maxConnectionsPerHost);
      return this;
    }
    @Override
    ClientOptions.Builder maxConnectionsPerHost(Optional<Integer> maxConnectionsPerHost) {
      if (maxConnectionsPerHost == null) {
        throw new NullPointerException("Null maxConnectionsPerHost");
      }
      this.maxConnectionsPerHost = maxConnectionsPerHost;
      return this;
    }
    @Override
    public ClientOptions build() {
      return new AutoValue_ClientOptions(
          this.maxConnections,
          this.maxConnectionsPerHost);
    }
  }

}
