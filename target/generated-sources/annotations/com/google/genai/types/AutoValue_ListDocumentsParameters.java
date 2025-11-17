package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListDocumentsParameters extends ListDocumentsParameters {

  private final Optional<String> parent;

  private final Optional<ListDocumentsConfig> config;

  private AutoValue_ListDocumentsParameters(
      Optional<String> parent,
      Optional<ListDocumentsConfig> config) {
    this.parent = parent;
    this.config = config;
  }

  @JsonProperty("parent")
  @Override
  public Optional<String> parent() {
    return parent;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListDocumentsConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListDocumentsParameters{"
        + "parent=" + parent + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListDocumentsParameters) {
      ListDocumentsParameters that = (ListDocumentsParameters) o;
      return this.parent.equals(that.parent())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= parent.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public ListDocumentsParameters.Builder toBuilder() {
    return new AutoValue_ListDocumentsParameters.Builder(this);
  }

  static final class Builder extends ListDocumentsParameters.Builder {
    private Optional<String> parent = Optional.empty();
    private Optional<ListDocumentsConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListDocumentsParameters source) {
      this.parent = source.parent();
      this.config = source.config();
    }
    @Override
    public ListDocumentsParameters.Builder parent(String parent) {
      this.parent = Optional.of(parent);
      return this;
    }
    @Override
    ListDocumentsParameters.Builder parent(Optional<String> parent) {
      if (parent == null) {
        throw new NullPointerException("Null parent");
      }
      this.parent = parent;
      return this;
    }
    @Override
    public ListDocumentsParameters.Builder config(ListDocumentsConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListDocumentsParameters.Builder config(Optional<ListDocumentsConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListDocumentsParameters build() {
      return new AutoValue_ListDocumentsParameters(
          this.parent,
          this.config);
    }
  }

}
