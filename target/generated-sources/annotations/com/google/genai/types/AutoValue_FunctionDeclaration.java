package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FunctionDeclaration extends FunctionDeclaration {

  private final Optional<Behavior> behavior;

  private final Optional<String> description;

  private final Optional<String> name;

  private final Optional<Schema> parameters;

  private final Optional<Object> parametersJsonSchema;

  private final Optional<Schema> response;

  private final Optional<Object> responseJsonSchema;

  private AutoValue_FunctionDeclaration(
      Optional<Behavior> behavior,
      Optional<String> description,
      Optional<String> name,
      Optional<Schema> parameters,
      Optional<Object> parametersJsonSchema,
      Optional<Schema> response,
      Optional<Object> responseJsonSchema) {
    this.behavior = behavior;
    this.description = description;
    this.name = name;
    this.parameters = parameters;
    this.parametersJsonSchema = parametersJsonSchema;
    this.response = response;
    this.responseJsonSchema = responseJsonSchema;
  }

  @JsonProperty("behavior")
  @Override
  public Optional<Behavior> behavior() {
    return behavior;
  }

  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("parameters")
  @Override
  public Optional<Schema> parameters() {
    return parameters;
  }

  @JsonProperty("parametersJsonSchema")
  @Override
  public Optional<Object> parametersJsonSchema() {
    return parametersJsonSchema;
  }

  @JsonProperty("response")
  @Override
  public Optional<Schema> response() {
    return response;
  }

  @JsonProperty("responseJsonSchema")
  @Override
  public Optional<Object> responseJsonSchema() {
    return responseJsonSchema;
  }

  @Override
  public String toString() {
    return "FunctionDeclaration{"
        + "behavior=" + behavior + ", "
        + "description=" + description + ", "
        + "name=" + name + ", "
        + "parameters=" + parameters + ", "
        + "parametersJsonSchema=" + parametersJsonSchema + ", "
        + "response=" + response + ", "
        + "responseJsonSchema=" + responseJsonSchema
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FunctionDeclaration) {
      FunctionDeclaration that = (FunctionDeclaration) o;
      return this.behavior.equals(that.behavior())
          && this.description.equals(that.description())
          && this.name.equals(that.name())
          && this.parameters.equals(that.parameters())
          && this.parametersJsonSchema.equals(that.parametersJsonSchema())
          && this.response.equals(that.response())
          && this.responseJsonSchema.equals(that.responseJsonSchema());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= behavior.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= parameters.hashCode();
    h$ *= 1000003;
    h$ ^= parametersJsonSchema.hashCode();
    h$ *= 1000003;
    h$ ^= response.hashCode();
    h$ *= 1000003;
    h$ ^= responseJsonSchema.hashCode();
    return h$;
  }

  @Override
  public FunctionDeclaration.Builder toBuilder() {
    return new AutoValue_FunctionDeclaration.Builder(this);
  }

  static final class Builder extends FunctionDeclaration.Builder {
    private Optional<Behavior> behavior = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<Schema> parameters = Optional.empty();
    private Optional<Object> parametersJsonSchema = Optional.empty();
    private Optional<Schema> response = Optional.empty();
    private Optional<Object> responseJsonSchema = Optional.empty();
    Builder() {
    }
    Builder(FunctionDeclaration source) {
      this.behavior = source.behavior();
      this.description = source.description();
      this.name = source.name();
      this.parameters = source.parameters();
      this.parametersJsonSchema = source.parametersJsonSchema();
      this.response = source.response();
      this.responseJsonSchema = source.responseJsonSchema();
    }
    @Override
    public FunctionDeclaration.Builder behavior(Behavior behavior) {
      this.behavior = Optional.of(behavior);
      return this;
    }
    @Override
    FunctionDeclaration.Builder behavior(Optional<Behavior> behavior) {
      if (behavior == null) {
        throw new NullPointerException("Null behavior");
      }
      this.behavior = behavior;
      return this;
    }
    @Override
    public FunctionDeclaration.Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }
    @Override
    FunctionDeclaration.Builder description(Optional<String> description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public FunctionDeclaration.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    FunctionDeclaration.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public FunctionDeclaration.Builder parameters(Schema parameters) {
      this.parameters = Optional.of(parameters);
      return this;
    }
    @Override
    FunctionDeclaration.Builder parameters(Optional<Schema> parameters) {
      if (parameters == null) {
        throw new NullPointerException("Null parameters");
      }
      this.parameters = parameters;
      return this;
    }
    @Override
    public FunctionDeclaration.Builder parametersJsonSchema(Object parametersJsonSchema) {
      this.parametersJsonSchema = Optional.of(parametersJsonSchema);
      return this;
    }
    @Override
    FunctionDeclaration.Builder parametersJsonSchema(Optional<Object> parametersJsonSchema) {
      if (parametersJsonSchema == null) {
        throw new NullPointerException("Null parametersJsonSchema");
      }
      this.parametersJsonSchema = parametersJsonSchema;
      return this;
    }
    @Override
    public FunctionDeclaration.Builder response(Schema response) {
      this.response = Optional.of(response);
      return this;
    }
    @Override
    FunctionDeclaration.Builder response(Optional<Schema> response) {
      if (response == null) {
        throw new NullPointerException("Null response");
      }
      this.response = response;
      return this;
    }
    @Override
    public FunctionDeclaration.Builder responseJsonSchema(Object responseJsonSchema) {
      this.responseJsonSchema = Optional.of(responseJsonSchema);
      return this;
    }
    @Override
    FunctionDeclaration.Builder responseJsonSchema(Optional<Object> responseJsonSchema) {
      if (responseJsonSchema == null) {
        throw new NullPointerException("Null responseJsonSchema");
      }
      this.responseJsonSchema = responseJsonSchema;
      return this;
    }
    @Override
    public FunctionDeclaration build() {
      return new AutoValue_FunctionDeclaration(
          this.behavior,
          this.description,
          this.name,
          this.parameters,
          this.parametersJsonSchema,
          this.response,
          this.responseJsonSchema);
    }
  }

}
