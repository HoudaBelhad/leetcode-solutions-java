package codes.yam.leetcode.palindromenumber;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
public class SolutionBenchmark {
    private final Solution solution = new Solution();

    // Inputs with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 digits — for O(log10(n)) scaling
    @Param({"7", "77", "777", "7777", "77777", "777777", "7777777", "77777777", "777777777", "2147483647"})
    private int input;

    @Benchmark
    public boolean isPalindrome() {
        return solution.isPalindrome(input);
    }

    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(SolutionBenchmark.class.getSimpleName())
                .addProfiler(GCProfiler.class)
                .result("target/benchmark-results.json")
                .resultFormat(ResultFormatType.JSON)
                .build();
        new Runner(opt).run();
    }
}
