package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Metric extends Metric {

  private final Optional<String> name;

  private final Optional<String> promptTemplate;

  private final Optional<String> judgeModelSystemInstruction;

  private final Optional<Boolean> returnRawOutput;

  private AutoValue_Metric(
      Optional<String> name,
      Optional<String> promptTemplate,
      Optional<String> judgeModelSystemInstruction,
      Optional<Boolean> returnRawOutput) {
    this.name = name;
    this.promptTemplate = promptTemplate;
    this.judgeModelSystemInstruction = judgeModelSystemInstruction;
    this.returnRawOutput = returnRawOutput;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("promptTemplate")
  @Override
  public Optional<String> promptTemplate() {
    return promptTemplate;
  }

  @JsonProperty("judgeModelSystemInstruction")
  @Override
  public Optional<String> judgeModelSystemInstruction() {
    return judgeModelSystemInstruction;
  }

  @JsonProperty("returnRawOutput")
  @Override
  public Optional<Boolean> returnRawOutput() {
    return returnRawOutput;
  }

  @Override
  public String toString() {
    return "Metric{"
        + "name=" + name + ", "
        + "promptTemplate=" + promptTemplate + ", "
        + "judgeModelSystemInstruction=" + judgeModelSystemInstruction + ", "
        + "returnRawOutput=" + returnRawOutput
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Metric) {
      Metric that = (Metric) o;
      return this.name.equals(that.name())
          && this.promptTemplate.equals(that.promptTemplate())
          && this.judgeModelSystemInstruction.equals(that.judgeModelSystemInstruction())
          && this.returnRawOutput.equals(that.returnRawOutput());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= promptTemplate.hashCode();
    h$ *= 1000003;
    h$ ^= judgeModelSystemInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= returnRawOutput.hashCode();
    return h$;
  }

  @Override
  public Metric.Builder toBuilder() {
    return new AutoValue_Metric.Builder(this);
  }

  static final class Builder extends Metric.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> promptTemplate = Optional.empty();
    private Optional<String> judgeModelSystemInstruction = Optional.empty();
    private Optional<Boolean> returnRawOutput = Optional.empty();
    Builder() {
    }
    Builder(Metric source) {
      this.name = source.name();
      this.promptTemplate = source.promptTemplate();
      this.judgeModelSystemInstruction = source.judgeModelSystemInstruction();
      this.returnRawOutput = source.returnRawOutput();
    }
    @Override
    public Metric.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    Metric.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Metric.Builder promptTemplate(String promptTemplate) {
      this.promptTemplate = Optional.of(promptTemplate);
      return this;
    }
    @Override
    Metric.Builder promptTemplate(Optional<String> promptTemplate) {
      if (promptTemplate == null) {
        throw new NullPointerException("Null promptTemplate");
      }
      this.promptTemplate = promptTemplate;
      return this;
    }
    @Override
    public Metric.Builder judgeModelSystemInstruction(String judgeModelSystemInstruction) {
      this.judgeModelSystemInstruction = Optional.of(judgeModelSystemInstruction);
      return this;
    }
    @Override
    Metric.Builder judgeModelSystemInstruction(Optional<String> judgeModelSystemInstruction) {
      if (judgeModelSystemInstruction == null) {
        throw new NullPointerException("Null judgeModelSystemInstruction");
      }
      this.judgeModelSystemInstruction = judgeModelSystemInstruction;
      return this;
    }
    @Override
    public Metric.Builder returnRawOutput(boolean returnRawOutput) {
      this.returnRawOutput = Optional.of(returnRawOutput);
      return this;
    }
    @Override
    Metric.Builder returnRawOutput(Optional<Boolean> returnRawOutput) {
      if (returnRawOutput == null) {
        throw new NullPointerException("Null returnRawOutput");
      }
      this.returnRawOutput = returnRawOutput;
      return this;
    }
    @Override
    public Metric build() {
      return new AutoValue_Metric(
          this.name,
          this.promptTemplate,
          this.judgeModelSystemInstruction,
          this.returnRawOutput);
    }
  }

}
