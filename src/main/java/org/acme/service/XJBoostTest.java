package org.acme.service;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.context.ApplicationScoped;
import ml.dmlc.xgboost4j.java.Booster;
import ml.dmlc.xgboost4j.java.XGBoost;
import ml.dmlc.xgboost4j.java.XGBoostError;

/**
 * XJBoost
 */
@ApplicationScoped
@RegisterForReflection
public class XJBoostTest {

        public String loadModelForPrediction() throws XGBoostError {
             loadMBooster();
             return "Model loaded successfully"; 
        }

        public Booster loadMBooster() throws XGBoostError {
            return XGBoost.loadModel("model.bin");
        }
}