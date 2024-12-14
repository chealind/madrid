package com.madrid;

import io.micronaut.core.optim.StaticOptimizations;
import io.micronaut.core.util.EnvironmentProperties;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentPropertiesOptimizationLoader implements StaticOptimizations.Loader<EnvironmentProperties> {
  private void load0(Map<String, List<String>> env) {
    env.put("LESS_TERMCAP_md", Arrays.asList("less.termcap.md", "less.termcap-md", "less-termcap.md", "less-termcap-md"));
    env.put("PATH", Arrays.asList("path"));
    env.put("LESS_TERMCAP_me", Arrays.asList("less.termcap.me", "less.termcap-me", "less-termcap.me", "less-termcap-me"));
    env.put("LESS_TERMCAP_mb", Arrays.asList("less.termcap.mb", "less.termcap-mb", "less-termcap.mb", "less-termcap-mb"));
    env.put("GRADLE_OPTS", Arrays.asList("gradle.opts", "gradle-opts"));
    env.put("ASDF_DIR", Arrays.asList("asdf.dir", "asdf-dir"));
    env.put("GREP_COLOR", Arrays.asList("grep.color", "grep-color"));
    env.put("LESS_TERMCAP_se", Arrays.asList("less.termcap.se", "less.termcap-se", "less-termcap.se", "less-termcap-se"));
    env.put("JAVA_HOME", Arrays.asList("java.home", "java-home"));
    env.put("TERM", Arrays.asList("term"));
    env.put("LESS_TERMCAP_us", Arrays.asList("less.termcap.us", "less.termcap-us", "less-termcap.us", "less-termcap-us"));
    env.put("LESS_TERMCAP_so", Arrays.asList("less.termcap.so", "less.termcap-so", "less-termcap.so", "less-termcap-so"));
    env.put("HOMEBREW_PREFIX", Arrays.asList("homebrew.prefix", "homebrew-prefix"));
    env.put("COMMAND_MODE", Arrays.asList("command.mode", "command-mode"));
    env.put("LESS_TERMCAP_ue", Arrays.asList("less.termcap.ue", "less.termcap-ue", "less-termcap.ue", "less-termcap-ue"));
    env.put("LOGNAME", Arrays.asList("logname"));
    env.put("JDK_HOME", Arrays.asList("jdk.home", "jdk-home"));
    env.put("HOMEBREW_REPOSITORY", Arrays.asList("homebrew.repository", "homebrew-repository"));
    env.put("PWD", Arrays.asList("pwd"));
    env.put("XPC_SERVICE_NAME", Arrays.asList("xpc.service.name", "xpc.service-name", "xpc-service.name", "xpc-service-name"));
    env.put("INFOPATH", Arrays.asList("infopath"));
    env.put("__CFBundleIdentifier", Arrays.asList("..cfbundleidentifier", ".-cfbundleidentifier", "-.cfbundleidentifier", "--cfbundleidentifier"));
    env.put("NVM_DIR", Arrays.asList("nvm.dir", "nvm-dir"));
    env.put("SHELL", Arrays.asList("shell"));
    env.put("PAGER", Arrays.asList("pager"));
    env.put("LSCOLORS", Arrays.asList("lscolors"));
    env.put("HOMEBREW_CELLAR", Arrays.asList("homebrew.cellar", "homebrew-cellar"));
    env.put("USER", Arrays.asList("user"));
    env.put("CLICOLOR", Arrays.asList("clicolor"));
    env.put("TERMINAL_EMULATOR", Arrays.asList("terminal.emulator", "terminal-emulator"));
    env.put("TMPDIR", Arrays.asList("tmpdir"));
    env.put("SSH_AUTH_SOCK", Arrays.asList("ssh.auth.sock", "ssh.auth-sock", "ssh-auth.sock", "ssh-auth-sock"));
    env.put("TRTOP", Arrays.asList("trtop"));
    env.put("XPC_FLAGS", Arrays.asList("xpc.flags", "xpc-flags"));
    env.put("__CF_USER_TEXT_ENCODING", Arrays.asList("..cf.user.text.encoding", "..cf.user.text-encoding", "..cf.user-text.encoding", "..cf.user-text-encoding", "..cf-user.text.encoding", "..cf-user.text-encoding", "..cf-user-text.encoding", "..cf-user-text-encoding", ".-cf.user.text.encoding", ".-cf.user.text-encoding", ".-cf.user-text.encoding", ".-cf.user-text-encoding", ".-cf-user.text.encoding", ".-cf-user.text-encoding", ".-cf-user-text.encoding", ".-cf-user-text-encoding", "-.cf.user.text.encoding", "-.cf.user.text-encoding", "-.cf.user-text.encoding", "-.cf.user-text-encoding", "-.cf-user.text.encoding", "-.cf-user.text-encoding", "-.cf-user-text.encoding", "-.cf-user-text-encoding", "--cf.user.text.encoding", "--cf.user.text-encoding", "--cf.user-text.encoding", "--cf.user-text-encoding", "--cf-user.text.encoding", "--cf-user.text-encoding", "--cf-user-text.encoding", "--cf-user-text-encoding"));
    env.put("LC_CTYPE", Arrays.asList("lc.ctype", "lc-ctype"));
    env.put("GREP_COLORS", Arrays.asList("grep.colors", "grep-colors"));
    env.put("HOME", Arrays.asList("home"));
    env.put("SHLVL", Arrays.asList("shlvl"));
  }

  @Override
  public EnvironmentProperties load() {
    Map<String, List<String>> env = new HashMap<String, List<String>>();
    load0(env);
    return EnvironmentProperties.of(env);
  }
}
