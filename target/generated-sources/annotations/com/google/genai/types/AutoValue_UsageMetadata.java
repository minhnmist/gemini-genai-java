package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UsageMetadata extends UsageMetadata {

  private final Optional<Integer> promptTokenCount;

  private final Optional<Integer> cachedContentTokenCount;

  private final Optional<Integer> responseTokenCount;

  private final Optional<Integer> toolUsePromptTokenCount;

  private final Optional<Integer> thoughtsTokenCount;

  private final Optional<Integer> totalTokenCount;

  private final Optional<List<ModalityTokenCount>> promptTokensDetails;

  private final Optional<List<ModalityTokenCount>> cacheTokensDetails;

  private final Optional<List<ModalityTokenCount>> responseTokensDetails;

  private final Optional<List<ModalityTokenCount>> toolUsePromptTokensDetails;

  private final Optional<TrafficType> trafficType;

  private AutoValue_UsageMetadata(
      Optional<Integer> promptTokenCount,
      Optional<Integer> cachedContentTokenCount,
      Optional<Integer> responseTokenCount,
      Optional<Integer> toolUsePromptTokenCount,
      Optional<Integer> thoughtsTokenCount,
      Optional<Integer> totalTokenCount,
      Optional<List<ModalityTokenCount>> promptTokensDetails,
      Optional<List<ModalityTokenCount>> cacheTokensDetails,
      Optional<List<ModalityTokenCount>> responseTokensDetails,
      Optional<List<ModalityTokenCount>> toolUsePromptTokensDetails,
      Optional<TrafficType> trafficType) {
    this.promptTokenCount = promptTokenCount;
    this.cachedContentTokenCount = cachedContentTokenCount;
    this.responseTokenCount = responseTokenCount;
    this.toolUsePromptTokenCount = toolUsePromptTokenCount;
    this.thoughtsTokenCount = thoughtsTokenCount;
    this.totalTokenCount = totalTokenCount;
    this.promptTokensDetails = promptTokensDetails;
    this.cacheTokensDetails = cacheTokensDetails;
    this.responseTokensDetails = responseTokensDetails;
    this.toolUsePromptTokensDetails = toolUsePromptTokensDetails;
    this.trafficType = trafficType;
  }

  @JsonProperty("promptTokenCount")
  @Override
  public Optional<Integer> promptTokenCount() {
    return promptTokenCount;
  }

  @JsonProperty("cachedContentTokenCount")
  @Override
  public Optional<Integer> cachedContentTokenCount() {
    return cachedContentTokenCount;
  }

  @JsonProperty("responseTokenCount")
  @Override
  public Optional<Integer> responseTokenCount() {
    return responseTokenCount;
  }

  @JsonProperty("toolUsePromptTokenCount")
  @Override
  public Optional<Integer> toolUsePromptTokenCount() {
    return toolUsePromptTokenCount;
  }

  @JsonProperty("thoughtsTokenCount")
  @Override
  public Optional<Integer> thoughtsTokenCount() {
    return thoughtsTokenCount;
  }

  @JsonProperty("totalTokenCount")
  @Override
  public Optional<Integer> totalTokenCount() {
    return totalTokenCount;
  }

  @JsonProperty("promptTokensDetails")
  @Override
  public Optional<List<ModalityTokenCount>> promptTokensDetails() {
    return promptTokensDetails;
  }

  @JsonProperty("cacheTokensDetails")
  @Override
  public Optional<List<ModalityTokenCount>> cacheTokensDetails() {
    return cacheTokensDetails;
  }

  @JsonProperty("responseTokensDetails")
  @Override
  public Optional<List<ModalityTokenCount>> responseTokensDetails() {
    return responseTokensDetails;
  }

  @JsonProperty("toolUsePromptTokensDetails")
  @Override
  public Optional<List<ModalityTokenCount>> toolUsePromptTokensDetails() {
    return toolUsePromptTokensDetails;
  }

  @JsonProperty("trafficType")
  @Override
  public Optional<TrafficType> trafficType() {
    return trafficType;
  }

  @Override
  public String toString() {
    return "UsageMetadata{"
        + "promptTokenCount=" + promptTokenCount + ", "
        + "cachedContentTokenCount=" + cachedContentTokenCount + ", "
        + "responseTokenCount=" + responseTokenCount + ", "
        + "toolUsePromptTokenCount=" + toolUsePromptTokenCount + ", "
        + "thoughtsTokenCount=" + thoughtsTokenCount + ", "
        + "totalTokenCount=" + totalTokenCount + ", "
        + "promptTokensDetails=" + promptTokensDetails + ", "
        + "cacheTokensDetails=" + cacheTokensDetails + ", "
        + "responseTokensDetails=" + responseTokensDetails + ", "
        + "toolUsePromptTokensDetails=" + toolUsePromptTokensDetails + ", "
        + "trafficType=" + trafficType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UsageMetadata) {
      UsageMetadata that = (UsageMetadata) o;
      return this.promptTokenCount.equals(that.promptTokenCount())
          && this.cachedContentTokenCount.equals(that.cachedContentTokenCount())
          && this.responseTokenCount.equals(that.responseTokenCount())
          && this.toolUsePromptTokenCount.equals(that.toolUsePromptTokenCount())
          && this.thoughtsTokenCount.equals(that.thoughtsTokenCount())
          && this.totalTokenCount.equals(that.totalTokenCount())
          && this.promptTokensDetails.equals(that.promptTokensDetails())
          && this.cacheTokensDetails.equals(that.cacheTokensDetails())
          && this.responseTokensDetails.equals(that.responseTokensDetails())
          && this.toolUsePromptTokensDetails.equals(that.toolUsePromptTokensDetails())
          && this.trafficType.equals(that.trafficType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= promptTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= cachedContentTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= responseTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= toolUsePromptTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= thoughtsTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= totalTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= promptTokensDetails.hashCode();
    h$ *= 1000003;
    h$ ^= cacheTokensDetails.hashCode();
    h$ *= 1000003;
    h$ ^= responseTokensDetails.hashCode();
    h$ *= 1000003;
    h$ ^= toolUsePromptTokensDetails.hashCode();
    h$ *= 1000003;
    h$ ^= trafficType.hashCode();
    return h$;
  }

  @Override
  public UsageMetadata.Builder toBuilder() {
    return new AutoValue_UsageMetadata.Builder(this);
  }

  static final class Builder extends UsageMetadata.Builder {
    private Optional<Integer> promptTokenCount = Optional.empty();
    private Optional<Integer> cachedContentTokenCount = Optional.empty();
    private Optional<Integer> responseTokenCount = Optional.empty();
    private Optional<Integer> toolUsePromptTokenCount = Optional.empty();
    private Optional<Integer> thoughtsTokenCount = Optional.empty();
    private Optional<Integer> totalTokenCount = Optional.empty();
    private Optional<List<ModalityTokenCount>> promptTokensDetails = Optional.empty();
    private Optional<List<ModalityTokenCount>> cacheTokensDetails = Optional.empty();
    private Optional<List<ModalityTokenCount>> responseTokensDetails = Optional.empty();
    private Optional<List<ModalityTokenCount>> toolUsePromptTokensDetails = Optional.empty();
    private Optional<TrafficType> trafficType = Optional.empty();
    Builder() {
    }
    Builder(UsageMetadata source) {
      this.promptTokenCount = source.promptTokenCount();
      this.cachedContentTokenCount = source.cachedContentTokenCount();
      this.responseTokenCount = source.responseTokenCount();
      this.toolUsePromptTokenCount = source.toolUsePromptTokenCount();
      this.thoughtsTokenCount = source.thoughtsTokenCount();
      this.totalTokenCount = source.totalTokenCount();
      this.promptTokensDetails = source.promptTokensDetails();
      this.cacheTokensDetails = source.cacheTokensDetails();
      this.responseTokensDetails = source.responseTokensDetails();
      this.toolUsePromptTokensDetails = source.toolUsePromptTokensDetails();
      this.trafficType = source.trafficType();
    }
    @Override
    public UsageMetadata.Builder promptTokenCount(Integer promptTokenCount) {
      this.promptTokenCount = Optional.of(promptTokenCount);
      return this;
    }
    @Override
    UsageMetadata.Builder promptTokenCount(Optional<Integer> promptTokenCount) {
      if (promptTokenCount == null) {
        throw new NullPointerException("Null promptTokenCount");
      }
      this.promptTokenCount = promptTokenCount;
      return this;
    }
    @Override
    public UsageMetadata.Builder cachedContentTokenCount(Integer cachedContentTokenCount) {
      this.cachedContentTokenCount = Optional.of(cachedContentTokenCount);
      return this;
    }
    @Override
    UsageMetadata.Builder cachedContentTokenCount(Optional<Integer> cachedContentTokenCount) {
      if (cachedContentTokenCount == null) {
        throw new NullPointerException("Null cachedContentTokenCount");
      }
      this.cachedContentTokenCount = cachedContentTokenCount;
      return this;
    }
    @Override
    public UsageMetadata.Builder responseTokenCount(Integer responseTokenCount) {
      this.responseTokenCount = Optional.of(responseTokenCount);
      return this;
    }
    @Override
    UsageMetadata.Builder responseTokenCount(Optional<Integer> responseTokenCount) {
      if (responseTokenCount == null) {
        throw new NullPointerException("Null responseTokenCount");
      }
      this.responseTokenCount = responseTokenCount;
      return this;
    }
    @Override
    public UsageMetadata.Builder toolUsePromptTokenCount(Integer toolUsePromptTokenCount) {
      this.toolUsePromptTokenCount = Optional.of(toolUsePromptTokenCount);
      return this;
    }
    @Override
    UsageMetadata.Builder toolUsePromptTokenCount(Optional<Integer> toolUsePromptTokenCount) {
      if (toolUsePromptTokenCount == null) {
        throw new NullPointerException("Null toolUsePromptTokenCount");
      }
      this.toolUsePromptTokenCount = toolUsePromptTokenCount;
      return this;
    }
    @Override
    public UsageMetadata.Builder thoughtsTokenCount(Integer thoughtsTokenCount) {
      this.thoughtsTokenCount = Optional.of(thoughtsTokenCount);
      return this;
    }
    @Override
    UsageMetadata.Builder thoughtsTokenCount(Optional<Integer> thoughtsTokenCount) {
      if (thoughtsTokenCount == null) {
        throw new NullPointerException("Null thoughtsTokenCount");
      }
      this.thoughtsTokenCount = thoughtsTokenCount;
      return this;
    }
    @Override
    public UsageMetadata.Builder totalTokenCount(Integer totalTokenCount) {
      this.totalTokenCount = Optional.of(totalTokenCount);
      return this;
    }
    @Override
    UsageMetadata.Builder totalTokenCount(Optional<Integer> totalTokenCount) {
      if (totalTokenCount == null) {
        throw new NullPointerException("Null totalTokenCount");
      }
      this.totalTokenCount = totalTokenCount;
      return this;
    }
    @Override
    public UsageMetadata.Builder promptTokensDetails(List<ModalityTokenCount> promptTokensDetails) {
      this.promptTokensDetails = Optional.of(promptTokensDetails);
      return this;
    }
    @Override
    UsageMetadata.Builder promptTokensDetails(Optional<List<ModalityTokenCount>> promptTokensDetails) {
      if (promptTokensDetails == null) {
        throw new NullPointerException("Null promptTokensDetails");
      }
      this.promptTokensDetails = promptTokensDetails;
      return this;
    }
    @Override
    public UsageMetadata.Builder cacheTokensDetails(List<ModalityTokenCount> cacheTokensDetails) {
      this.cacheTokensDetails = Optional.of(cacheTokensDetails);
      return this;
    }
    @Override
    UsageMetadata.Builder cacheTokensDetails(Optional<List<ModalityTokenCount>> cacheTokensDetails) {
      if (cacheTokensDetails == null) {
        throw new NullPointerException("Null cacheTokensDetails");
      }
      this.cacheTokensDetails = cacheTokensDetails;
      return this;
    }
    @Override
    public UsageMetadata.Builder responseTokensDetails(List<ModalityTokenCount> responseTokensDetails) {
      this.responseTokensDetails = Optional.of(responseTokensDetails);
      return this;
    }
    @Override
    UsageMetadata.Builder responseTokensDetails(Optional<List<ModalityTokenCount>> responseTokensDetails) {
      if (responseTokensDetails == null) {
        throw new NullPointerException("Null responseTokensDetails");
      }
      this.responseTokensDetails = responseTokensDetails;
      return this;
    }
    @Override
    public UsageMetadata.Builder toolUsePromptTokensDetails(List<ModalityTokenCount> toolUsePromptTokensDetails) {
      this.toolUsePromptTokensDetails = Optional.of(toolUsePromptTokensDetails);
      return this;
    }
    @Override
    UsageMetadata.Builder toolUsePromptTokensDetails(Optional<List<ModalityTokenCount>> toolUsePromptTokensDetails) {
      if (toolUsePromptTokensDetails == null) {
        throw new NullPointerException("Null toolUsePromptTokensDetails");
      }
      this.toolUsePromptTokensDetails = toolUsePromptTokensDetails;
      return this;
    }
    @Override
    public UsageMetadata.Builder trafficType(TrafficType trafficType) {
      this.trafficType = Optional.of(trafficType);
      return this;
    }
    @Override
    UsageMetadata.Builder trafficType(Optional<TrafficType> trafficType) {
      if (trafficType == null) {
        throw new NullPointerException("Null trafficType");
      }
      this.trafficType = trafficType;
      return this;
    }
    @Override
    public UsageMetadata build() {
      return new AutoValue_UsageMetadata(
          this.promptTokenCount,
          this.cachedContentTokenCount,
          this.responseTokenCount,
          this.toolUsePromptTokenCount,
          this.thoughtsTokenCount,
          this.totalTokenCount,
          this.promptTokensDetails,
          this.cacheTokensDetails,
          this.responseTokensDetails,
          this.toolUsePromptTokensDetails,
          this.trafficType);
    }
  }

}
