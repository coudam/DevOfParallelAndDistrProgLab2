package AirportDelays;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<AirportKey, Text> {
    public int getPartition(AirportKey key, Text value, int numReduceTasks) {
        return (key.getAirportID().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}
