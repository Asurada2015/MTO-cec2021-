package etmo.metaheuristics.moead;

import etmo.core.MtoAlgorithm;
import etmo.core.ProblemSet;
import etmo.core.SolutionSet;
import etmo.util.JMException;

public class EMTMOEAD extends MtoAlgorithm {



    /**
     * Constructor
     *
     * @param problemSet The problem to be solved
     */
    public EMTMOEAD(ProblemSet problemSet) {
        super(problemSet);
    }

    @Override
    public SolutionSet[] execute() throws JMException, ClassNotFoundException {
        return new SolutionSet[0];
    }
}
