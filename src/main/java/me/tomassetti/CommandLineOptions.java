package me.tomassetti;

import com.beust.jcommander.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Optional;
import java.util.Properties;

/**
* Created by ftomassetti on 13/04/15.
*/
class CommandLineOptions {

    @Parameter(names = "--debug")
    boolean debug = false;

    @Parameter(names = {"--service-port"})
    Integer servicePort = 5432;

    @Parameter(names = {"--database"})
    String database = "bmu0peel5cts9gz";

    @Parameter(names = {"--db-host"})
    String dbHost = "bmu0peel5cts9gz.postgresql.clvrcld.net";

    @Parameter(names = {"--db-username"})
    String dbUsername = "us13lxvoqyixdxclqdft";

    @Parameter(names = {"--db-password"})
    String dbPassword = "mGtT9SolEd7a2y2uDJId";

    @Parameter(names = {"--db-port"})
    Integer dbPort = 5432;


}
