package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Part extends Part {

  private final Optional<FunctionCall> functionCall;

  private final Optional<CodeExecutionResult> codeExecutionResult;

  private final Optional<ExecutableCode> executableCode;

  private final Optional<FileData> fileData;

  private final Optional<FunctionResponse> functionResponse;

  private final Optional<Blob> inlineData;

  private final Optional<String> text;

  private final Optional<Boolean> thought;

  private final Optional<byte[]> thoughtSignature;

  private final Optional<VideoMetadata> videoMetadata;

  private AutoValue_Part(
      Optional<FunctionCall> functionCall,
      Optional<CodeExecutionResult> codeExecutionResult,
      Optional<ExecutableCode> executableCode,
      Optional<FileData> fileData,
      Optional<FunctionResponse> functionResponse,
      Optional<Blob> inlineData,
      Optional<String> text,
      Optional<Boolean> thought,
      Optional<byte[]> thoughtSignature,
      Optional<VideoMetadata> videoMetadata) {
    this.functionCall = functionCall;
    this.codeExecutionResult = codeExecutionResult;
    this.executableCode = executableCode;
    this.fileData = fileData;
    this.functionResponse = functionResponse;
    this.inlineData = inlineData;
    this.text = text;
    this.thought = thought;
    this.thoughtSignature = thoughtSignature;
    this.videoMetadata = videoMetadata;
  }

  @JsonProperty("functionCall")
  @Override
  public Optional<FunctionCall> functionCall() {
    return functionCall;
  }

  @JsonProperty("codeExecutionResult")
  @Override
  public Optional<CodeExecutionResult> codeExecutionResult() {
    return codeExecutionResult;
  }

  @JsonProperty("executableCode")
  @Override
  public Optional<ExecutableCode> executableCode() {
    return executableCode;
  }

  @JsonProperty("fileData")
  @Override
  public Optional<FileData> fileData() {
    return fileData;
  }

  @JsonProperty("functionResponse")
  @Override
  public Optional<FunctionResponse> functionResponse() {
    return functionResponse;
  }

  @JsonProperty("inlineData")
  @Override
  public Optional<Blob> inlineData() {
    return inlineData;
  }

  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return text;
  }

  @JsonProperty("thought")
  @Override
  public Optional<Boolean> thought() {
    return thought;
  }

  @JsonProperty("thoughtSignature")
  @Override
  public Optional<byte[]> thoughtSignature() {
    return thoughtSignature;
  }

  @JsonProperty("videoMetadata")
  @Override
  public Optional<VideoMetadata> videoMetadata() {
    return videoMetadata;
  }

  @Override
  public String toString() {
    return "Part{"
        + "functionCall=" + functionCall + ", "
        + "codeExecutionResult=" + codeExecutionResult + ", "
        + "executableCode=" + executableCode + ", "
        + "fileData=" + fileData + ", "
        + "functionResponse=" + functionResponse + ", "
        + "inlineData=" + inlineData + ", "
        + "text=" + text + ", "
        + "thought=" + thought + ", "
        + "thoughtSignature=" + thoughtSignature + ", "
        + "videoMetadata=" + videoMetadata
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Part) {
      Part that = (Part) o;
      return this.functionCall.equals(that.functionCall())
          && this.codeExecutionResult.equals(that.codeExecutionResult())
          && this.executableCode.equals(that.executableCode())
          && this.fileData.equals(that.fileData())
          && this.functionResponse.equals(that.functionResponse())
          && this.inlineData.equals(that.inlineData())
          && this.text.equals(that.text())
          && this.thought.equals(that.thought())
          && this.thoughtSignature.equals(that.thoughtSignature())
          && this.videoMetadata.equals(that.videoMetadata());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= functionCall.hashCode();
    h$ *= 1000003;
    h$ ^= codeExecutionResult.hashCode();
    h$ *= 1000003;
    h$ ^= executableCode.hashCode();
    h$ *= 1000003;
    h$ ^= fileData.hashCode();
    h$ *= 1000003;
    h$ ^= functionResponse.hashCode();
    h$ *= 1000003;
    h$ ^= inlineData.hashCode();
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= thought.hashCode();
    h$ *= 1000003;
    h$ ^= thoughtSignature.hashCode();
    h$ *= 1000003;
    h$ ^= videoMetadata.hashCode();
    return h$;
  }

  @Override
  public Part.Builder toBuilder() {
    return new AutoValue_Part.Builder(this);
  }

  static final class Builder extends Part.Builder {
    private Optional<FunctionCall> functionCall = Optional.empty();
    private Optional<CodeExecutionResult> codeExecutionResult = Optional.empty();
    private Optional<ExecutableCode> executableCode = Optional.empty();
    private Optional<FileData> fileData = Optional.empty();
    private Optional<FunctionResponse> functionResponse = Optional.empty();
    private Optional<Blob> inlineData = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<Boolean> thought = Optional.empty();
    private Optional<byte[]> thoughtSignature = Optional.empty();
    private Optional<VideoMetadata> videoMetadata = Optional.empty();
    Builder() {
    }
    Builder(Part source) {
      this.functionCall = source.functionCall();
      this.codeExecutionResult = source.codeExecutionResult();
      this.executableCode = source.executableCode();
      this.fileData = source.fileData();
      this.functionResponse = source.functionResponse();
      this.inlineData = source.inlineData();
      this.text = source.text();
      this.thought = source.thought();
      this.thoughtSignature = source.thoughtSignature();
      this.videoMetadata = source.videoMetadata();
    }
    @Override
    public Part.Builder functionCall(FunctionCall functionCall) {
      this.functionCall = Optional.of(functionCall);
      return this;
    }
    @Override
    Part.Builder functionCall(Optional<FunctionCall> functionCall) {
      if (functionCall == null) {
        throw new NullPointerException("Null functionCall");
      }
      this.functionCall = functionCall;
      return this;
    }
    @Override
    public Part.Builder codeExecutionResult(CodeExecutionResult codeExecutionResult) {
      this.codeExecutionResult = Optional.of(codeExecutionResult);
      return this;
    }
    @Override
    Part.Builder codeExecutionResult(Optional<CodeExecutionResult> codeExecutionResult) {
      if (codeExecutionResult == null) {
        throw new NullPointerException("Null codeExecutionResult");
      }
      this.codeExecutionResult = codeExecutionResult;
      return this;
    }
    @Override
    public Part.Builder executableCode(ExecutableCode executableCode) {
      this.executableCode = Optional.of(executableCode);
      return this;
    }
    @Override
    Part.Builder executableCode(Optional<ExecutableCode> executableCode) {
      if (executableCode == null) {
        throw new NullPointerException("Null executableCode");
      }
      this.executableCode = executableCode;
      return this;
    }
    @Override
    public Part.Builder fileData(FileData fileData) {
      this.fileData = Optional.of(fileData);
      return this;
    }
    @Override
    Part.Builder fileData(Optional<FileData> fileData) {
      if (fileData == null) {
        throw new NullPointerException("Null fileData");
      }
      this.fileData = fileData;
      return this;
    }
    @Override
    public Part.Builder functionResponse(FunctionResponse functionResponse) {
      this.functionResponse = Optional.of(functionResponse);
      return this;
    }
    @Override
    Part.Builder functionResponse(Optional<FunctionResponse> functionResponse) {
      if (functionResponse == null) {
        throw new NullPointerException("Null functionResponse");
      }
      this.functionResponse = functionResponse;
      return this;
    }
    @Override
    public Part.Builder inlineData(Blob inlineData) {
      this.inlineData = Optional.of(inlineData);
      return this;
    }
    @Override
    Part.Builder inlineData(Optional<Blob> inlineData) {
      if (inlineData == null) {
        throw new NullPointerException("Null inlineData");
      }
      this.inlineData = inlineData;
      return this;
    }
    @Override
    public Part.Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }
    @Override
    Part.Builder text(Optional<String> text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public Part.Builder thought(boolean thought) {
      this.thought = Optional.of(thought);
      return this;
    }
    @Override
    Part.Builder thought(Optional<Boolean> thought) {
      if (thought == null) {
        throw new NullPointerException("Null thought");
      }
      this.thought = thought;
      return this;
    }
    @Override
    public Part.Builder thoughtSignature(byte[] thoughtSignature) {
      this.thoughtSignature = Optional.of(thoughtSignature);
      return this;
    }
    @Override
    Part.Builder thoughtSignature(Optional<byte[]> thoughtSignature) {
      if (thoughtSignature == null) {
        throw new NullPointerException("Null thoughtSignature");
      }
      this.thoughtSignature = thoughtSignature;
      return this;
    }
    @Override
    public Part.Builder videoMetadata(VideoMetadata videoMetadata) {
      this.videoMetadata = Optional.of(videoMetadata);
      return this;
    }
    @Override
    Part.Builder videoMetadata(Optional<VideoMetadata> videoMetadata) {
      if (videoMetadata == null) {
        throw new NullPointerException("Null videoMetadata");
      }
      this.videoMetadata = videoMetadata;
      return this;
    }
    @Override
    public Part build() {
      return new AutoValue_Part(
          this.functionCall,
          this.codeExecutionResult,
          this.executableCode,
          this.fileData,
          this.functionResponse,
          this.inlineData,
          this.text,
          this.thought,
          this.thoughtSignature,
          this.videoMetadata);
    }
  }

}
