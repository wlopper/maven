package org.apache.maven.repository;

public class Proxy
{
    public final static String PROXY_SOCKS5 = "SOCKS_5";

    public final static String PROXY_SOCKS4 = "SOCKS4";

    public final static String PROXY_HTTP = "HTTP";

    /**
     * Proxy server host
     */
    private String host;

    /**
     * Username used to access the proxy server
     */
    private String userName;

    /**
     * Password associated with the proxy server
     */
    private String password;

    /**
     * Proxy server port
     */
    private int port;

    /**
     * Type of the proxy
     */
    private String type;

    /**
     * The non-proxy hosts. Follows Java system property format: <code>*.foo.com|localhost</code>.
     */
    private String nonProxyHosts;

    /**
     * For NTLM proxies, specifies the NTLM host.
     */
    private String ntlmHost;

    /**
     * For NTLM proxies, specifies the NTLM domain.
     */
    private String ntlmDomain;

    /**
     * Return proxy server host name.
     * 
     * @return proxy server host name
     */
    public String getHost()
    {
        return host;
    }

    /**
     * Set proxy host name.
     * 
     * @param host proxy server host name
     */
    public void setHost( String host )
    {
        this.host = host;
    }

    /**
     * Get user's password used to login to proxy server.
     * 
     * @return user's password at proxy host
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Set the user's password for the proxy server.
     * 
     * @param password password to use to login to a proxy server
     */
    public void setPassword( String password )
    {
        this.password = password;
    }

    /**
     * Get the proxy port.
     * 
     * @return proxy server port
     */
    public int getPort()
    {
        return port;
    }

    /**
     * Set the proxy port.
     * 
     * @param port proxy server port
     */
    public void setPort( int port )
    {
        this.port = port;
    }

    /**
     * Get the proxy username.
     * 
     * @return username for the proxy server
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * Set the proxy username.
     * 
     * @param userName username for the proxy server
     */
    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    /**
     * Get the type of the proxy server.
     * 
     * @return the type of the proxy server
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type the type of the proxy server like <i>SOCKSv4</i>
     */
    public void setType( String type )
    {
        this.type = type;
    }

    public String getNonProxyHosts()
    {
        return nonProxyHosts;
    }

    public void setNonProxyHosts( String nonProxyHosts )
    {
        this.nonProxyHosts = nonProxyHosts;
    }

    public String getNtlmHost()
    {
        return ntlmHost;
    }

    public void setNtlmHost( String ntlmHost )
    {
        this.ntlmHost = ntlmHost;
    }

    public void setNtlmDomain( String ntlmDomain )
    {
        this.ntlmDomain = ntlmDomain;
    }

    public String getNtlmDomain()
    {
        return ntlmDomain;
    }
}
