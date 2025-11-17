package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TuningJob extends TuningJob {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> name;

  private final Optional<JobState> state;

  private final Optional<Instant> createTime;

  private final Optional<Instant> startTime;

  private final Optional<Instant> endTime;

  private final Optional<Instant> updateTime;

  private final Optional<GoogleRpcStatus> error;

  private final Optional<String> description;

  private final Optional<String> baseModel;

  private final Optional<TunedModel> tunedModel;

  private final Optional<PreTunedModel> preTunedModel;

  private final Optional<SupervisedTuningSpec> supervisedTuningSpec;

  private final Optional<PreferenceOptimizationSpec> preferenceOptimizationSpec;

  private final Optional<TuningDataStats> tuningDataStats;

  private final Optional<EncryptionSpec> encryptionSpec;

  private final Optional<PartnerModelTuningSpec> partnerModelTuningSpec;

  private final Optional<EvaluationConfig> evaluationConfig;

  private final Optional<String> customBaseModel;

  private final Optional<String> experiment;

  private final Optional<Map<String, String>> labels;

  private final Optional<String> outputUri;

  private final Optional<String> pipelineJob;

  private final Optional<String> serviceAccount;

  private final Optional<String> tunedModelDisplayName;

  private final Optional<VeoTuningSpec> veoTuningSpec;

  private AutoValue_TuningJob(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> name,
      Optional<JobState> state,
      Optional<Instant> createTime,
      Optional<Instant> startTime,
      Optional<Instant> endTime,
      Optional<Instant> updateTime,
      Optional<GoogleRpcStatus> error,
      Optional<String> description,
      Optional<String> baseModel,
      Optional<TunedModel> tunedModel,
      Optional<PreTunedModel> preTunedModel,
      Optional<SupervisedTuningSpec> supervisedTuningSpec,
      Optional<PreferenceOptimizationSpec> preferenceOptimizationSpec,
      Optional<TuningDataStats> tuningDataStats,
      Optional<EncryptionSpec> encryptionSpec,
      Optional<PartnerModelTuningSpec> partnerModelTuningSpec,
      Optional<EvaluationConfig> evaluationConfig,
      Optional<String> customBaseModel,
      Optional<String> experiment,
      Optional<Map<String, String>> labels,
      Optional<String> outputUri,
      Optional<String> pipelineJob,
      Optional<String> serviceAccount,
      Optional<String> tunedModelDisplayName,
      Optional<VeoTuningSpec> veoTuningSpec) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.name = name;
    this.state = state;
    this.createTime = createTime;
    this.startTime = startTime;
    this.endTime = endTime;
    this.updateTime = updateTime;
    this.error = error;
    this.description = description;
    this.baseModel = baseModel;
    this.tunedModel = tunedModel;
    this.preTunedModel = preTunedModel;
    this.supervisedTuningSpec = supervisedTuningSpec;
    this.preferenceOptimizationSpec = preferenceOptimizationSpec;
    this.tuningDataStats = tuningDataStats;
    this.encryptionSpec = encryptionSpec;
    this.partnerModelTuningSpec = partnerModelTuningSpec;
    this.evaluationConfig = evaluationConfig;
    this.customBaseModel = customBaseModel;
    this.experiment = experiment;
    this.labels = labels;
    this.outputUri = outputUri;
    this.pipelineJob = pipelineJob;
    this.serviceAccount = serviceAccount;
    this.tunedModelDisplayName = tunedModelDisplayName;
    this.veoTuningSpec = veoTuningSpec;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("state")
  @Override
  public Optional<JobState> state() {
    return state;
  }

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("startTime")
  @Override
  public Optional<Instant> startTime() {
    return startTime;
  }

  @JsonProperty("endTime")
  @Override
  public Optional<Instant> endTime() {
    return endTime;
  }

  @JsonProperty("updateTime")
  @Override
  public Optional<Instant> updateTime() {
    return updateTime;
  }

  @JsonProperty("error")
  @Override
  public Optional<GoogleRpcStatus> error() {
    return error;
  }

  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty("baseModel")
  @Override
  public Optional<String> baseModel() {
    return baseModel;
  }

  @JsonProperty("tunedModel")
  @Override
  public Optional<TunedModel> tunedModel() {
    return tunedModel;
  }

  @JsonProperty("preTunedModel")
  @Override
  public Optional<PreTunedModel> preTunedModel() {
    return preTunedModel;
  }

  @JsonProperty("supervisedTuningSpec")
  @Override
  public Optional<SupervisedTuningSpec> supervisedTuningSpec() {
    return supervisedTuningSpec;
  }

  @JsonProperty("preferenceOptimizationSpec")
  @Override
  public Optional<PreferenceOptimizationSpec> preferenceOptimizationSpec() {
    return preferenceOptimizationSpec;
  }

  @JsonProperty("tuningDataStats")
  @Override
  public Optional<TuningDataStats> tuningDataStats() {
    return tuningDataStats;
  }

  @JsonProperty("encryptionSpec")
  @Override
  public Optional<EncryptionSpec> encryptionSpec() {
    return encryptionSpec;
  }

  @JsonProperty("partnerModelTuningSpec")
  @Override
  public Optional<PartnerModelTuningSpec> partnerModelTuningSpec() {
    return partnerModelTuningSpec;
  }

  @JsonProperty("evaluationConfig")
  @Override
  public Optional<EvaluationConfig> evaluationConfig() {
    return evaluationConfig;
  }

  @JsonProperty("customBaseModel")
  @Override
  public Optional<String> customBaseModel() {
    return customBaseModel;
  }

  @JsonProperty("experiment")
  @Override
  public Optional<String> experiment() {
    return experiment;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @JsonProperty("outputUri")
  @Override
  public Optional<String> outputUri() {
    return outputUri;
  }

  @JsonProperty("pipelineJob")
  @Override
  public Optional<String> pipelineJob() {
    return pipelineJob;
  }

  @JsonProperty("serviceAccount")
  @Override
  public Optional<String> serviceAccount() {
    return serviceAccount;
  }

  @JsonProperty("tunedModelDisplayName")
  @Override
  public Optional<String> tunedModelDisplayName() {
    return tunedModelDisplayName;
  }

  @JsonProperty("veoTuningSpec")
  @Override
  public Optional<VeoTuningSpec> veoTuningSpec() {
    return veoTuningSpec;
  }

  @Override
  public String toString() {
    return "TuningJob{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "name=" + name + ", "
        + "state=" + state + ", "
        + "createTime=" + createTime + ", "
        + "startTime=" + startTime + ", "
        + "endTime=" + endTime + ", "
        + "updateTime=" + updateTime + ", "
        + "error=" + error + ", "
        + "description=" + description + ", "
        + "baseModel=" + baseModel + ", "
        + "tunedModel=" + tunedModel + ", "
        + "preTunedModel=" + preTunedModel + ", "
        + "supervisedTuningSpec=" + supervisedTuningSpec + ", "
        + "preferenceOptimizationSpec=" + preferenceOptimizationSpec + ", "
        + "tuningDataStats=" + tuningDataStats + ", "
        + "encryptionSpec=" + encryptionSpec + ", "
        + "partnerModelTuningSpec=" + partnerModelTuningSpec + ", "
        + "evaluationConfig=" + evaluationConfig + ", "
        + "customBaseModel=" + customBaseModel + ", "
        + "experiment=" + experiment + ", "
        + "labels=" + labels + ", "
        + "outputUri=" + outputUri + ", "
        + "pipelineJob=" + pipelineJob + ", "
        + "serviceAccount=" + serviceAccount + ", "
        + "tunedModelDisplayName=" + tunedModelDisplayName + ", "
        + "veoTuningSpec=" + veoTuningSpec
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TuningJob) {
      TuningJob that = (TuningJob) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.name.equals(that.name())
          && this.state.equals(that.state())
          && this.createTime.equals(that.createTime())
          && this.startTime.equals(that.startTime())
          && this.endTime.equals(that.endTime())
          && this.updateTime.equals(that.updateTime())
          && this.error.equals(that.error())
          && this.description.equals(that.description())
          && this.baseModel.equals(that.baseModel())
          && this.tunedModel.equals(that.tunedModel())
          && this.preTunedModel.equals(that.preTunedModel())
          && this.supervisedTuningSpec.equals(that.supervisedTuningSpec())
          && this.preferenceOptimizationSpec.equals(that.preferenceOptimizationSpec())
          && this.tuningDataStats.equals(that.tuningDataStats())
          && this.encryptionSpec.equals(that.encryptionSpec())
          && this.partnerModelTuningSpec.equals(that.partnerModelTuningSpec())
          && this.evaluationConfig.equals(that.evaluationConfig())
          && this.customBaseModel.equals(that.customBaseModel())
          && this.experiment.equals(that.experiment())
          && this.labels.equals(that.labels())
          && this.outputUri.equals(that.outputUri())
          && this.pipelineJob.equals(that.pipelineJob())
          && this.serviceAccount.equals(that.serviceAccount())
          && this.tunedModelDisplayName.equals(that.tunedModelDisplayName())
          && this.veoTuningSpec.equals(that.veoTuningSpec());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= state.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= startTime.hashCode();
    h$ *= 1000003;
    h$ ^= endTime.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= baseModel.hashCode();
    h$ *= 1000003;
    h$ ^= tunedModel.hashCode();
    h$ *= 1000003;
    h$ ^= preTunedModel.hashCode();
    h$ *= 1000003;
    h$ ^= supervisedTuningSpec.hashCode();
    h$ *= 1000003;
    h$ ^= preferenceOptimizationSpec.hashCode();
    h$ *= 1000003;
    h$ ^= tuningDataStats.hashCode();
    h$ *= 1000003;
    h$ ^= encryptionSpec.hashCode();
    h$ *= 1000003;
    h$ ^= partnerModelTuningSpec.hashCode();
    h$ *= 1000003;
    h$ ^= evaluationConfig.hashCode();
    h$ *= 1000003;
    h$ ^= customBaseModel.hashCode();
    h$ *= 1000003;
    h$ ^= experiment.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    h$ *= 1000003;
    h$ ^= outputUri.hashCode();
    h$ *= 1000003;
    h$ ^= pipelineJob.hashCode();
    h$ *= 1000003;
    h$ ^= serviceAccount.hashCode();
    h$ *= 1000003;
    h$ ^= tunedModelDisplayName.hashCode();
    h$ *= 1000003;
    h$ ^= veoTuningSpec.hashCode();
    return h$;
  }

  @Override
  public TuningJob.Builder toBuilder() {
    return new AutoValue_TuningJob.Builder(this);
  }

  static final class Builder extends TuningJob.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<JobState> state = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<Instant> startTime = Optional.empty();
    private Optional<Instant> endTime = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    private Optional<GoogleRpcStatus> error = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> baseModel = Optional.empty();
    private Optional<TunedModel> tunedModel = Optional.empty();
    private Optional<PreTunedModel> preTunedModel = Optional.empty();
    private Optional<SupervisedTuningSpec> supervisedTuningSpec = Optional.empty();
    private Optional<PreferenceOptimizationSpec> preferenceOptimizationSpec = Optional.empty();
    private Optional<TuningDataStats> tuningDataStats = Optional.empty();
    private Optional<EncryptionSpec> encryptionSpec = Optional.empty();
    private Optional<PartnerModelTuningSpec> partnerModelTuningSpec = Optional.empty();
    private Optional<EvaluationConfig> evaluationConfig = Optional.empty();
    private Optional<String> customBaseModel = Optional.empty();
    private Optional<String> experiment = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    private Optional<String> outputUri = Optional.empty();
    private Optional<String> pipelineJob = Optional.empty();
    private Optional<String> serviceAccount = Optional.empty();
    private Optional<String> tunedModelDisplayName = Optional.empty();
    private Optional<VeoTuningSpec> veoTuningSpec = Optional.empty();
    Builder() {
    }
    Builder(TuningJob source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.name = source.name();
      this.state = source.state();
      this.createTime = source.createTime();
      this.startTime = source.startTime();
      this.endTime = source.endTime();
      this.updateTime = source.updateTime();
      this.error = source.error();
      this.description = source.description();
      this.baseModel = source.baseModel();
      this.tunedModel = source.tunedModel();
      this.preTunedModel = source.preTunedModel();
      this.supervisedTuningSpec = source.supervisedTuningSpec();
      this.preferenceOptimizationSpec = source.preferenceOptimizationSpec();
      this.tuningDataStats = source.tuningDataStats();
      this.encryptionSpec = source.encryptionSpec();
      this.partnerModelTuningSpec = source.partnerModelTuningSpec();
      this.evaluationConfig = source.evaluationConfig();
      this.customBaseModel = source.customBaseModel();
      this.experiment = source.experiment();
      this.labels = source.labels();
      this.outputUri = source.outputUri();
      this.pipelineJob = source.pipelineJob();
      this.serviceAccount = source.serviceAccount();
      this.tunedModelDisplayName = source.tunedModelDisplayName();
      this.veoTuningSpec = source.veoTuningSpec();
    }
    @Override
    public TuningJob.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    TuningJob.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public TuningJob.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    TuningJob.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public TuningJob.Builder state(JobState state) {
      this.state = Optional.of(state);
      return this;
    }
    @Override
    TuningJob.Builder state(Optional<JobState> state) {
      if (state == null) {
        throw new NullPointerException("Null state");
      }
      this.state = state;
      return this;
    }
    @Override
    public TuningJob.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    TuningJob.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public TuningJob.Builder startTime(Instant startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }
    @Override
    TuningJob.Builder startTime(Optional<Instant> startTime) {
      if (startTime == null) {
        throw new NullPointerException("Null startTime");
      }
      this.startTime = startTime;
      return this;
    }
    @Override
    public TuningJob.Builder endTime(Instant endTime) {
      this.endTime = Optional.of(endTime);
      return this;
    }
    @Override
    TuningJob.Builder endTime(Optional<Instant> endTime) {
      if (endTime == null) {
        throw new NullPointerException("Null endTime");
      }
      this.endTime = endTime;
      return this;
    }
    @Override
    public TuningJob.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    TuningJob.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public TuningJob.Builder error(GoogleRpcStatus error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    TuningJob.Builder error(Optional<GoogleRpcStatus> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public TuningJob.Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }
    @Override
    TuningJob.Builder description(Optional<String> description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public TuningJob.Builder baseModel(String baseModel) {
      this.baseModel = Optional.of(baseModel);
      return this;
    }
    @Override
    TuningJob.Builder baseModel(Optional<String> baseModel) {
      if (baseModel == null) {
        throw new NullPointerException("Null baseModel");
      }
      this.baseModel = baseModel;
      return this;
    }
    @Override
    public TuningJob.Builder tunedModel(TunedModel tunedModel) {
      this.tunedModel = Optional.of(tunedModel);
      return this;
    }
    @Override
    TuningJob.Builder tunedModel(Optional<TunedModel> tunedModel) {
      if (tunedModel == null) {
        throw new NullPointerException("Null tunedModel");
      }
      this.tunedModel = tunedModel;
      return this;
    }
    @Override
    public TuningJob.Builder preTunedModel(PreTunedModel preTunedModel) {
      this.preTunedModel = Optional.of(preTunedModel);
      return this;
    }
    @Override
    TuningJob.Builder preTunedModel(Optional<PreTunedModel> preTunedModel) {
      if (preTunedModel == null) {
        throw new NullPointerException("Null preTunedModel");
      }
      this.preTunedModel = preTunedModel;
      return this;
    }
    @Override
    public TuningJob.Builder supervisedTuningSpec(SupervisedTuningSpec supervisedTuningSpec) {
      this.supervisedTuningSpec = Optional.of(supervisedTuningSpec);
      return this;
    }
    @Override
    TuningJob.Builder supervisedTuningSpec(Optional<SupervisedTuningSpec> supervisedTuningSpec) {
      if (supervisedTuningSpec == null) {
        throw new NullPointerException("Null supervisedTuningSpec");
      }
      this.supervisedTuningSpec = supervisedTuningSpec;
      return this;
    }
    @Override
    public TuningJob.Builder preferenceOptimizationSpec(PreferenceOptimizationSpec preferenceOptimizationSpec) {
      this.preferenceOptimizationSpec = Optional.of(preferenceOptimizationSpec);
      return this;
    }
    @Override
    TuningJob.Builder preferenceOptimizationSpec(Optional<PreferenceOptimizationSpec> preferenceOptimizationSpec) {
      if (preferenceOptimizationSpec == null) {
        throw new NullPointerException("Null preferenceOptimizationSpec");
      }
      this.preferenceOptimizationSpec = preferenceOptimizationSpec;
      return this;
    }
    @Override
    public TuningJob.Builder tuningDataStats(TuningDataStats tuningDataStats) {
      this.tuningDataStats = Optional.of(tuningDataStats);
      return this;
    }
    @Override
    TuningJob.Builder tuningDataStats(Optional<TuningDataStats> tuningDataStats) {
      if (tuningDataStats == null) {
        throw new NullPointerException("Null tuningDataStats");
      }
      this.tuningDataStats = tuningDataStats;
      return this;
    }
    @Override
    public TuningJob.Builder encryptionSpec(EncryptionSpec encryptionSpec) {
      this.encryptionSpec = Optional.of(encryptionSpec);
      return this;
    }
    @Override
    TuningJob.Builder encryptionSpec(Optional<EncryptionSpec> encryptionSpec) {
      if (encryptionSpec == null) {
        throw new NullPointerException("Null encryptionSpec");
      }
      this.encryptionSpec = encryptionSpec;
      return this;
    }
    @Override
    public TuningJob.Builder partnerModelTuningSpec(PartnerModelTuningSpec partnerModelTuningSpec) {
      this.partnerModelTuningSpec = Optional.of(partnerModelTuningSpec);
      return this;
    }
    @Override
    TuningJob.Builder partnerModelTuningSpec(Optional<PartnerModelTuningSpec> partnerModelTuningSpec) {
      if (partnerModelTuningSpec == null) {
        throw new NullPointerException("Null partnerModelTuningSpec");
      }
      this.partnerModelTuningSpec = partnerModelTuningSpec;
      return this;
    }
    @Override
    public TuningJob.Builder evaluationConfig(EvaluationConfig evaluationConfig) {
      this.evaluationConfig = Optional.of(evaluationConfig);
      return this;
    }
    @Override
    TuningJob.Builder evaluationConfig(Optional<EvaluationConfig> evaluationConfig) {
      if (evaluationConfig == null) {
        throw new NullPointerException("Null evaluationConfig");
      }
      this.evaluationConfig = evaluationConfig;
      return this;
    }
    @Override
    public TuningJob.Builder customBaseModel(String customBaseModel) {
      this.customBaseModel = Optional.of(customBaseModel);
      return this;
    }
    @Override
    TuningJob.Builder customBaseModel(Optional<String> customBaseModel) {
      if (customBaseModel == null) {
        throw new NullPointerException("Null customBaseModel");
      }
      this.customBaseModel = customBaseModel;
      return this;
    }
    @Override
    public TuningJob.Builder experiment(String experiment) {
      this.experiment = Optional.of(experiment);
      return this;
    }
    @Override
    TuningJob.Builder experiment(Optional<String> experiment) {
      if (experiment == null) {
        throw new NullPointerException("Null experiment");
      }
      this.experiment = experiment;
      return this;
    }
    @Override
    public TuningJob.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    TuningJob.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public TuningJob.Builder outputUri(String outputUri) {
      this.outputUri = Optional.of(outputUri);
      return this;
    }
    @Override
    TuningJob.Builder outputUri(Optional<String> outputUri) {
      if (outputUri == null) {
        throw new NullPointerException("Null outputUri");
      }
      this.outputUri = outputUri;
      return this;
    }
    @Override
    public TuningJob.Builder pipelineJob(String pipelineJob) {
      this.pipelineJob = Optional.of(pipelineJob);
      return this;
    }
    @Override
    TuningJob.Builder pipelineJob(Optional<String> pipelineJob) {
      if (pipelineJob == null) {
        throw new NullPointerException("Null pipelineJob");
      }
      this.pipelineJob = pipelineJob;
      return this;
    }
    @Override
    public TuningJob.Builder serviceAccount(String serviceAccount) {
      this.serviceAccount = Optional.of(serviceAccount);
      return this;
    }
    @Override
    TuningJob.Builder serviceAccount(Optional<String> serviceAccount) {
      if (serviceAccount == null) {
        throw new NullPointerException("Null serviceAccount");
      }
      this.serviceAccount = serviceAccount;
      return this;
    }
    @Override
    public TuningJob.Builder tunedModelDisplayName(String tunedModelDisplayName) {
      this.tunedModelDisplayName = Optional.of(tunedModelDisplayName);
      return this;
    }
    @Override
    TuningJob.Builder tunedModelDisplayName(Optional<String> tunedModelDisplayName) {
      if (tunedModelDisplayName == null) {
        throw new NullPointerException("Null tunedModelDisplayName");
      }
      this.tunedModelDisplayName = tunedModelDisplayName;
      return this;
    }
    @Override
    public TuningJob.Builder veoTuningSpec(VeoTuningSpec veoTuningSpec) {
      this.veoTuningSpec = Optional.of(veoTuningSpec);
      return this;
    }
    @Override
    TuningJob.Builder veoTuningSpec(Optional<VeoTuningSpec> veoTuningSpec) {
      if (veoTuningSpec == null) {
        throw new NullPointerException("Null veoTuningSpec");
      }
      this.veoTuningSpec = veoTuningSpec;
      return this;
    }
    @Override
    public TuningJob build() {
      return new AutoValue_TuningJob(
          this.sdkHttpResponse,
          this.name,
          this.state,
          this.createTime,
          this.startTime,
          this.endTime,
          this.updateTime,
          this.error,
          this.description,
          this.baseModel,
          this.tunedModel,
          this.preTunedModel,
          this.supervisedTuningSpec,
          this.preferenceOptimizationSpec,
          this.tuningDataStats,
          this.encryptionSpec,
          this.partnerModelTuningSpec,
          this.evaluationConfig,
          this.customBaseModel,
          this.experiment,
          this.labels,
          this.outputUri,
          this.pipelineJob,
          this.serviceAccount,
          this.tunedModelDisplayName,
          this.veoTuningSpec);
    }
  }

}
