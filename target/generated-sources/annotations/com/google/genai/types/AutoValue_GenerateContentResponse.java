package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.jspecify.annotations.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateContentResponse extends GenerateContentResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<List<Candidate>> candidates;

  private final Optional<Instant> createTime;

  private final Optional<List<Content>> automaticFunctionCallingHistory;

  private final Optional<String> modelVersion;

  private final Optional<GenerateContentResponsePromptFeedback> promptFeedback;

  private final Optional<String> responseId;

  private final Optional<GenerateContentResponseUsageMetadata> usageMetadata;

  private AutoValue_GenerateContentResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<List<Candidate>> candidates,
      Optional<Instant> createTime,
      Optional<List<Content>> automaticFunctionCallingHistory,
      Optional<String> modelVersion,
      Optional<GenerateContentResponsePromptFeedback> promptFeedback,
      Optional<String> responseId,
      Optional<GenerateContentResponseUsageMetadata> usageMetadata) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.candidates = candidates;
    this.createTime = createTime;
    this.automaticFunctionCallingHistory = automaticFunctionCallingHistory;
    this.modelVersion = modelVersion;
    this.promptFeedback = promptFeedback;
    this.responseId = responseId;
    this.usageMetadata = usageMetadata;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("candidates")
  @Override
  public Optional<List<Candidate>> candidates() {
    return candidates;
  }

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("automaticFunctionCallingHistory")
  @Override
  public Optional<List<Content>> automaticFunctionCallingHistory() {
    return automaticFunctionCallingHistory;
  }

  @JsonProperty("modelVersion")
  @Override
  public Optional<String> modelVersion() {
    return modelVersion;
  }

  @JsonProperty("promptFeedback")
  @Override
  public Optional<GenerateContentResponsePromptFeedback> promptFeedback() {
    return promptFeedback;
  }

  @JsonProperty("responseId")
  @Override
  public Optional<String> responseId() {
    return responseId;
  }

  @JsonProperty("usageMetadata")
  @Override
  public Optional<GenerateContentResponseUsageMetadata> usageMetadata() {
    return usageMetadata;
  }

  @Override
  public String toString() {
    return "GenerateContentResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "candidates=" + candidates + ", "
        + "createTime=" + createTime + ", "
        + "automaticFunctionCallingHistory=" + automaticFunctionCallingHistory + ", "
        + "modelVersion=" + modelVersion + ", "
        + "promptFeedback=" + promptFeedback + ", "
        + "responseId=" + responseId + ", "
        + "usageMetadata=" + usageMetadata
        + "}";
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateContentResponse) {
      GenerateContentResponse that = (GenerateContentResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.candidates.equals(that.candidates())
          && this.createTime.equals(that.createTime())
          && this.automaticFunctionCallingHistory.equals(that.automaticFunctionCallingHistory())
          && this.modelVersion.equals(that.modelVersion())
          && this.promptFeedback.equals(that.promptFeedback())
          && this.responseId.equals(that.responseId())
          && this.usageMetadata.equals(that.usageMetadata());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= candidates.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= automaticFunctionCallingHistory.hashCode();
    h$ *= 1000003;
    h$ ^= modelVersion.hashCode();
    h$ *= 1000003;
    h$ ^= promptFeedback.hashCode();
    h$ *= 1000003;
    h$ ^= responseId.hashCode();
    h$ *= 1000003;
    h$ ^= usageMetadata.hashCode();
    return h$;
  }

  @Override
  public GenerateContentResponse.Builder toBuilder() {
    return new AutoValue_GenerateContentResponse.Builder(this);
  }

  static final class Builder extends GenerateContentResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<List<Candidate>> candidates = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<List<Content>> automaticFunctionCallingHistory = Optional.empty();
    private Optional<String> modelVersion = Optional.empty();
    private Optional<GenerateContentResponsePromptFeedback> promptFeedback = Optional.empty();
    private Optional<String> responseId = Optional.empty();
    private Optional<GenerateContentResponseUsageMetadata> usageMetadata = Optional.empty();
    Builder() {
    }
    Builder(GenerateContentResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.candidates = source.candidates();
      this.createTime = source.createTime();
      this.automaticFunctionCallingHistory = source.automaticFunctionCallingHistory();
      this.modelVersion = source.modelVersion();
      this.promptFeedback = source.promptFeedback();
      this.responseId = source.responseId();
      this.usageMetadata = source.usageMetadata();
    }
    @Override
    public GenerateContentResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    GenerateContentResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder candidates(List<Candidate> candidates) {
      this.candidates = Optional.of(candidates);
      return this;
    }
    @Override
    GenerateContentResponse.Builder candidates(Optional<List<Candidate>> candidates) {
      if (candidates == null) {
        throw new NullPointerException("Null candidates");
      }
      this.candidates = candidates;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    GenerateContentResponse.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder automaticFunctionCallingHistory(List<Content> automaticFunctionCallingHistory) {
      this.automaticFunctionCallingHistory = Optional.of(automaticFunctionCallingHistory);
      return this;
    }
    @Override
    GenerateContentResponse.Builder automaticFunctionCallingHistory(Optional<List<Content>> automaticFunctionCallingHistory) {
      if (automaticFunctionCallingHistory == null) {
        throw new NullPointerException("Null automaticFunctionCallingHistory");
      }
      this.automaticFunctionCallingHistory = automaticFunctionCallingHistory;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder modelVersion(String modelVersion) {
      this.modelVersion = Optional.of(modelVersion);
      return this;
    }
    @Override
    GenerateContentResponse.Builder modelVersion(Optional<String> modelVersion) {
      if (modelVersion == null) {
        throw new NullPointerException("Null modelVersion");
      }
      this.modelVersion = modelVersion;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder promptFeedback(GenerateContentResponsePromptFeedback promptFeedback) {
      this.promptFeedback = Optional.of(promptFeedback);
      return this;
    }
    @Override
    GenerateContentResponse.Builder promptFeedback(Optional<GenerateContentResponsePromptFeedback> promptFeedback) {
      if (promptFeedback == null) {
        throw new NullPointerException("Null promptFeedback");
      }
      this.promptFeedback = promptFeedback;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder responseId(String responseId) {
      this.responseId = Optional.of(responseId);
      return this;
    }
    @Override
    GenerateContentResponse.Builder responseId(Optional<String> responseId) {
      if (responseId == null) {
        throw new NullPointerException("Null responseId");
      }
      this.responseId = responseId;
      return this;
    }
    @Override
    public GenerateContentResponse.Builder usageMetadata(GenerateContentResponseUsageMetadata usageMetadata) {
      this.usageMetadata = Optional.of(usageMetadata);
      return this;
    }
    @Override
    GenerateContentResponse.Builder usageMetadata(Optional<GenerateContentResponseUsageMetadata> usageMetadata) {
      if (usageMetadata == null) {
        throw new NullPointerException("Null usageMetadata");
      }
      this.usageMetadata = usageMetadata;
      return this;
    }
    @Override
    public GenerateContentResponse build() {
      return new AutoValue_GenerateContentResponse(
          this.sdkHttpResponse,
          this.candidates,
          this.createTime,
          this.automaticFunctionCallingHistory,
          this.modelVersion,
          this.promptFeedback,
          this.responseId,
          this.usageMetadata);
    }
  }

}
