package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Model extends Model {

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<String> description;

  private final Optional<String> version;

  private final Optional<List<Endpoint>> endpoints;

  private final Optional<Map<String, String>> labels;

  private final Optional<TunedModelInfo> tunedModelInfo;

  private final Optional<Integer> inputTokenLimit;

  private final Optional<Integer> outputTokenLimit;

  private final Optional<List<String>> supportedActions;

  private final Optional<String> defaultCheckpointId;

  private final Optional<List<Checkpoint>> checkpoints;

  private final Optional<Float> temperature;

  private final Optional<Float> maxTemperature;

  private final Optional<Float> topP;

  private final Optional<Integer> topK;

  private final Optional<Boolean> thinking;

  private AutoValue_Model(
      Optional<String> name,
      Optional<String> displayName,
      Optional<String> description,
      Optional<String> version,
      Optional<List<Endpoint>> endpoints,
      Optional<Map<String, String>> labels,
      Optional<TunedModelInfo> tunedModelInfo,
      Optional<Integer> inputTokenLimit,
      Optional<Integer> outputTokenLimit,
      Optional<List<String>> supportedActions,
      Optional<String> defaultCheckpointId,
      Optional<List<Checkpoint>> checkpoints,
      Optional<Float> temperature,
      Optional<Float> maxTemperature,
      Optional<Float> topP,
      Optional<Integer> topK,
      Optional<Boolean> thinking) {
    this.name = name;
    this.displayName = displayName;
    this.description = description;
    this.version = version;
    this.endpoints = endpoints;
    this.labels = labels;
    this.tunedModelInfo = tunedModelInfo;
    this.inputTokenLimit = inputTokenLimit;
    this.outputTokenLimit = outputTokenLimit;
    this.supportedActions = supportedActions;
    this.defaultCheckpointId = defaultCheckpointId;
    this.checkpoints = checkpoints;
    this.temperature = temperature;
    this.maxTemperature = maxTemperature;
    this.topP = topP;
    this.topK = topK;
    this.thinking = thinking;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
  }

  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return version;
  }

  @JsonProperty("endpoints")
  @Override
  public Optional<List<Endpoint>> endpoints() {
    return endpoints;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @JsonProperty("tunedModelInfo")
  @Override
  public Optional<TunedModelInfo> tunedModelInfo() {
    return tunedModelInfo;
  }

  @JsonProperty("inputTokenLimit")
  @Override
  public Optional<Integer> inputTokenLimit() {
    return inputTokenLimit;
  }

  @JsonProperty("outputTokenLimit")
  @Override
  public Optional<Integer> outputTokenLimit() {
    return outputTokenLimit;
  }

  @JsonProperty("supportedActions")
  @Override
  public Optional<List<String>> supportedActions() {
    return supportedActions;
  }

  @JsonProperty("defaultCheckpointId")
  @Override
  public Optional<String> defaultCheckpointId() {
    return defaultCheckpointId;
  }

  @JsonProperty("checkpoints")
  @Override
  public Optional<List<Checkpoint>> checkpoints() {
    return checkpoints;
  }

  @JsonProperty("temperature")
  @Override
  public Optional<Float> temperature() {
    return temperature;
  }

  @JsonProperty("maxTemperature")
  @Override
  public Optional<Float> maxTemperature() {
    return maxTemperature;
  }

  @JsonProperty("topP")
  @Override
  public Optional<Float> topP() {
    return topP;
  }

  @JsonProperty("topK")
  @Override
  public Optional<Integer> topK() {
    return topK;
  }

  @JsonProperty("thinking")
  @Override
  public Optional<Boolean> thinking() {
    return thinking;
  }

  @Override
  public String toString() {
    return "Model{"
        + "name=" + name + ", "
        + "displayName=" + displayName + ", "
        + "description=" + description + ", "
        + "version=" + version + ", "
        + "endpoints=" + endpoints + ", "
        + "labels=" + labels + ", "
        + "tunedModelInfo=" + tunedModelInfo + ", "
        + "inputTokenLimit=" + inputTokenLimit + ", "
        + "outputTokenLimit=" + outputTokenLimit + ", "
        + "supportedActions=" + supportedActions + ", "
        + "defaultCheckpointId=" + defaultCheckpointId + ", "
        + "checkpoints=" + checkpoints + ", "
        + "temperature=" + temperature + ", "
        + "maxTemperature=" + maxTemperature + ", "
        + "topP=" + topP + ", "
        + "topK=" + topK + ", "
        + "thinking=" + thinking
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Model) {
      Model that = (Model) o;
      return this.name.equals(that.name())
          && this.displayName.equals(that.displayName())
          && this.description.equals(that.description())
          && this.version.equals(that.version())
          && this.endpoints.equals(that.endpoints())
          && this.labels.equals(that.labels())
          && this.tunedModelInfo.equals(that.tunedModelInfo())
          && this.inputTokenLimit.equals(that.inputTokenLimit())
          && this.outputTokenLimit.equals(that.outputTokenLimit())
          && this.supportedActions.equals(that.supportedActions())
          && this.defaultCheckpointId.equals(that.defaultCheckpointId())
          && this.checkpoints.equals(that.checkpoints())
          && this.temperature.equals(that.temperature())
          && this.maxTemperature.equals(that.maxTemperature())
          && this.topP.equals(that.topP())
          && this.topK.equals(that.topK())
          && this.thinking.equals(that.thinking());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= version.hashCode();
    h$ *= 1000003;
    h$ ^= endpoints.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    h$ *= 1000003;
    h$ ^= tunedModelInfo.hashCode();
    h$ *= 1000003;
    h$ ^= inputTokenLimit.hashCode();
    h$ *= 1000003;
    h$ ^= outputTokenLimit.hashCode();
    h$ *= 1000003;
    h$ ^= supportedActions.hashCode();
    h$ *= 1000003;
    h$ ^= defaultCheckpointId.hashCode();
    h$ *= 1000003;
    h$ ^= checkpoints.hashCode();
    h$ *= 1000003;
    h$ ^= temperature.hashCode();
    h$ *= 1000003;
    h$ ^= maxTemperature.hashCode();
    h$ *= 1000003;
    h$ ^= topP.hashCode();
    h$ *= 1000003;
    h$ ^= topK.hashCode();
    h$ *= 1000003;
    h$ ^= thinking.hashCode();
    return h$;
  }

  @Override
  public Model.Builder toBuilder() {
    return new AutoValue_Model.Builder(this);
  }

  static final class Builder extends Model.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> version = Optional.empty();
    private Optional<List<Endpoint>> endpoints = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    private Optional<TunedModelInfo> tunedModelInfo = Optional.empty();
    private Optional<Integer> inputTokenLimit = Optional.empty();
    private Optional<Integer> outputTokenLimit = Optional.empty();
    private Optional<List<String>> supportedActions = Optional.empty();
    private Optional<String> defaultCheckpointId = Optional.empty();
    private Optional<List<Checkpoint>> checkpoints = Optional.empty();
    private Optional<Float> temperature = Optional.empty();
    private Optional<Float> maxTemperature = Optional.empty();
    private Optional<Float> topP = Optional.empty();
    private Optional<Integer> topK = Optional.empty();
    private Optional<Boolean> thinking = Optional.empty();
    Builder() {
    }
    Builder(Model source) {
      this.name = source.name();
      this.displayName = source.displayName();
      this.description = source.description();
      this.version = source.version();
      this.endpoints = source.endpoints();
      this.labels = source.labels();
      this.tunedModelInfo = source.tunedModelInfo();
      this.inputTokenLimit = source.inputTokenLimit();
      this.outputTokenLimit = source.outputTokenLimit();
      this.supportedActions = source.supportedActions();
      this.defaultCheckpointId = source.defaultCheckpointId();
      this.checkpoints = source.checkpoints();
      this.temperature = source.temperature();
      this.maxTemperature = source.maxTemperature();
      this.topP = source.topP();
      this.topK = source.topK();
      this.thinking = source.thinking();
    }
    @Override
    public Model.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    Model.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Model.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    Model.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public Model.Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }
    @Override
    Model.Builder description(Optional<String> description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public Model.Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }
    @Override
    Model.Builder version(Optional<String> version) {
      if (version == null) {
        throw new NullPointerException("Null version");
      }
      this.version = version;
      return this;
    }
    @Override
    public Model.Builder endpoints(List<Endpoint> endpoints) {
      this.endpoints = Optional.of(endpoints);
      return this;
    }
    @Override
    Model.Builder endpoints(Optional<List<Endpoint>> endpoints) {
      if (endpoints == null) {
        throw new NullPointerException("Null endpoints");
      }
      this.endpoints = endpoints;
      return this;
    }
    @Override
    public Model.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    Model.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public Model.Builder tunedModelInfo(TunedModelInfo tunedModelInfo) {
      this.tunedModelInfo = Optional.of(tunedModelInfo);
      return this;
    }
    @Override
    Model.Builder tunedModelInfo(Optional<TunedModelInfo> tunedModelInfo) {
      if (tunedModelInfo == null) {
        throw new NullPointerException("Null tunedModelInfo");
      }
      this.tunedModelInfo = tunedModelInfo;
      return this;
    }
    @Override
    public Model.Builder inputTokenLimit(Integer inputTokenLimit) {
      this.inputTokenLimit = Optional.of(inputTokenLimit);
      return this;
    }
    @Override
    Model.Builder inputTokenLimit(Optional<Integer> inputTokenLimit) {
      if (inputTokenLimit == null) {
        throw new NullPointerException("Null inputTokenLimit");
      }
      this.inputTokenLimit = inputTokenLimit;
      return this;
    }
    @Override
    public Model.Builder outputTokenLimit(Integer outputTokenLimit) {
      this.outputTokenLimit = Optional.of(outputTokenLimit);
      return this;
    }
    @Override
    Model.Builder outputTokenLimit(Optional<Integer> outputTokenLimit) {
      if (outputTokenLimit == null) {
        throw new NullPointerException("Null outputTokenLimit");
      }
      this.outputTokenLimit = outputTokenLimit;
      return this;
    }
    @Override
    public Model.Builder supportedActions(List<String> supportedActions) {
      this.supportedActions = Optional.of(supportedActions);
      return this;
    }
    @Override
    Model.Builder supportedActions(Optional<List<String>> supportedActions) {
      if (supportedActions == null) {
        throw new NullPointerException("Null supportedActions");
      }
      this.supportedActions = supportedActions;
      return this;
    }
    @Override
    public Model.Builder defaultCheckpointId(String defaultCheckpointId) {
      this.defaultCheckpointId = Optional.of(defaultCheckpointId);
      return this;
    }
    @Override
    Model.Builder defaultCheckpointId(Optional<String> defaultCheckpointId) {
      if (defaultCheckpointId == null) {
        throw new NullPointerException("Null defaultCheckpointId");
      }
      this.defaultCheckpointId = defaultCheckpointId;
      return this;
    }
    @Override
    public Model.Builder checkpoints(List<Checkpoint> checkpoints) {
      this.checkpoints = Optional.of(checkpoints);
      return this;
    }
    @Override
    Model.Builder checkpoints(Optional<List<Checkpoint>> checkpoints) {
      if (checkpoints == null) {
        throw new NullPointerException("Null checkpoints");
      }
      this.checkpoints = checkpoints;
      return this;
    }
    @Override
    public Model.Builder temperature(Float temperature) {
      this.temperature = Optional.of(temperature);
      return this;
    }
    @Override
    Model.Builder temperature(Optional<Float> temperature) {
      if (temperature == null) {
        throw new NullPointerException("Null temperature");
      }
      this.temperature = temperature;
      return this;
    }
    @Override
    public Model.Builder maxTemperature(Float maxTemperature) {
      this.maxTemperature = Optional.of(maxTemperature);
      return this;
    }
    @Override
    Model.Builder maxTemperature(Optional<Float> maxTemperature) {
      if (maxTemperature == null) {
        throw new NullPointerException("Null maxTemperature");
      }
      this.maxTemperature = maxTemperature;
      return this;
    }
    @Override
    public Model.Builder topP(Float topP) {
      this.topP = Optional.of(topP);
      return this;
    }
    @Override
    Model.Builder topP(Optional<Float> topP) {
      if (topP == null) {
        throw new NullPointerException("Null topP");
      }
      this.topP = topP;
      return this;
    }
    @Override
    public Model.Builder topK(Integer topK) {
      this.topK = Optional.of(topK);
      return this;
    }
    @Override
    Model.Builder topK(Optional<Integer> topK) {
      if (topK == null) {
        throw new NullPointerException("Null topK");
      }
      this.topK = topK;
      return this;
    }
    @Override
    public Model.Builder thinking(boolean thinking) {
      this.thinking = Optional.of(thinking);
      return this;
    }
    @Override
    Model.Builder thinking(Optional<Boolean> thinking) {
      if (thinking == null) {
        throw new NullPointerException("Null thinking");
      }
      this.thinking = thinking;
      return this;
    }
    @Override
    public Model build() {
      return new AutoValue_Model(
          this.name,
          this.displayName,
          this.description,
          this.version,
          this.endpoints,
          this.labels,
          this.tunedModelInfo,
          this.inputTokenLimit,
          this.outputTokenLimit,
          this.supportedActions,
          this.defaultCheckpointId,
          this.checkpoints,
          this.temperature,
          this.maxTemperature,
          this.topP,
          this.topK,
          this.thinking);
    }
  }

}
