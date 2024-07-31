package org.example.extension;

import com.google.auto.service.AutoService;
import io.opentelemetry.javaagent.bootstrap.internal.AgentInstrumentationConfig;
import io.opentelemetry.javaagent.extension.instrumentation.InstrumentationModule;
import io.opentelemetry.javaagent.extension.instrumentation.TypeInstrumentation;

import java.util.List;


@AutoService(InstrumentationModule.class)
public class SampleInstrumentationModule extends InstrumentationModule {

    private boolean ready= true;

    public SampleInstrumentationModule() {
        super("hamonica", "hamonica2");
    }

    @Override
    public List<TypeInstrumentation> typeInstrumentations() {

        AgentInstrumentationConfig.get().getString("ssss");

        return List.of();
    }

    @Override
    public int order() {
        return super.order();
    }
}
