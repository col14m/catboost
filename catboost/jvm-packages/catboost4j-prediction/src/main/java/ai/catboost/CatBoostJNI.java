package ai.catboost;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

class CatBoostJNI {
    final void catBoostHashCatFeature(
            @NotNull String catFeature,
            @NotNull int[] hash) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostHashCatFeature(catFeature, hash));
    }

    final void catBoostHashCatFeatures(
            @NotNull String[] catFeatures,
            @NotNull int[] hashes) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostHashCatFeatures(catFeatures, hashes));
    }

    final void catBoostLoadModelFromFile(
            @NotNull String fname,
            @NotNull long[] handle) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostLoadModelFromFile(fname, handle));
    }

    final void catBoostLoadModelFromArray(
            @NotNull byte[] data,
            @NotNull long[] handle) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostLoadModelFromArray(data, handle));
    }

    final void catBoostFreeModel(long handle) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostFreeModel(handle));
    }

    final void catBoostModelGetPredictionDimension(
            long handle,
            @NotNull int[] classesCount) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelGetPredictionDimension(handle, classesCount));
    }

    final void catBoostModelGetNumericFeatureCount(
            long handle,
            @NotNull int[] numericFeatureCount) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelGetNumericFeatureCount(handle, numericFeatureCount));
    }

    final void catBoostModelGetCategoricalFeatureCount(
            long handle,
            @NotNull int[] catFeatureCount) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelGetCategoricalFeatureCount(handle, catFeatureCount));
    }

    final void catBoostModelGetTreeCount(
            long handle,
            @NotNull int[] treeCount) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelGetTreeCount(handle, treeCount));
    }

    final void catBoostModelPredict(
            long handle,
            @Nullable float[] numericFeatures,
            @Nullable String[] catFeatures,
            @NotNull double[] predictions) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelPredict(handle, numericFeatures, catFeatures, predictions));
    }

    final void catBoostModelPredict(
            long handle,
            @Nullable float[] numericFeatures,
            @Nullable int[] catFeatureHashes,
            @NotNull double[] predictions) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelPredict(handle, numericFeatures, catFeatureHashes, predictions));
    }

    final void catBoostModelPredict(
            long handle,
            @Nullable float[][] numericFeatures,
            @Nullable String[][] catFeatures,
            @NotNull double[] predictions) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelPredict(handle, numericFeatures, catFeatures, predictions));
    }

    final void catBoostModelPredict(
            long handle,
            @Nullable float[][] numericFeatures,
            @Nullable int[][] catFeatureHashes,
            @NotNull double[] predictions) throws CatBoostError {
        CatBoostJNIImpl.checkCall(CatBoostJNIImpl.catBoostModelPredict(handle, numericFeatures, catFeatureHashes, predictions));
    }
}
