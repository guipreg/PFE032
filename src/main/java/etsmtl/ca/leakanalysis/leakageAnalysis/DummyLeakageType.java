package etsmtl.ca.leakanalysis.leakageAnalysis;

public class DummyLeakageType extends ILeakageType
{
    @Override
    public boolean analyze(String file)
    {
        return Math.random() >= 0.5;
    }
}
