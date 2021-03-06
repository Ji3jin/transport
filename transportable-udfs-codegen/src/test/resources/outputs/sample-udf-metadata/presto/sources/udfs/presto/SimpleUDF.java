package udfs.presto;

import com.linkedin.transport.api.udf.StdUDF;
import com.linkedin.transport.presto.StdUdfWrapper;
import java.lang.Override;

public class SimpleUDF extends StdUdfWrapper {
  public SimpleUDF() {
    super(new udfs.SimpleUDF());
  }

  @Override
  protected StdUDF getStdUDF() {
    return new udfs.SimpleUDF();
  }
}
