/**
 * Contains some examples about Networking topic.
 *
 * <head><link rel="stylesheet" type="text/css" href="../../../files/mystyle.css"></head>
 * <p>
 * The term <i>network programming</i> refers to writing programs that execute across multiple
 * devices (computers), in which the devices are all connected to each other using a network.
 * </p>
 * <p>
 * The java.net package of the J2SE APIs contains a collection of classes and interfaces that
 * provide the low-level communication details, allowing you to write programs that focus on solving
 * the problem at hand.
 * </p>
 * <p>
 * The java.net package provides support for the two common network protocols:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>TCP:</b> TCP stands for Transmission Control Protocol, which allows for reliable communication
 * between two applications. TCP is typically used over the Internet Protocol, which is referred to
 * as TCP/IP.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>UDP:</b> UDP stands for User Datagram Protocol, a connection-less protocol that allows for
 * packets of data to be transmitted between applications.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Socket Programming:</h2>
 * <p>
 * Sockets provide the communication mechanism between two computers using TCP. A client program
 * creates a socket on its end of the communication and attempts to connect that socket to a server.
 * </p>
 * <p>
 * When the connection is made, the server creates a socket object on its end of the communication.
 * The client and server can now communicate by writing to and reading from the socket.
 * </p>
 * <p>
 * The java.net.Socket class represents a socket, and the java.net.ServerSocket class provides a
 * mechanism for the server program to listen for clients and establish connections with them.
 * </p>
 * <p>
 * The following steps occur when establishing a TCP connection between two computers using sockets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The server instantiates a ServerSocket object, denoting which port number communication is to
 * occur on.
 * </p>
 * </li>
 * <li>
 * <p>
 * The server invokes the accept() method of the ServerSocket class. This method waits until a
 * client connects to the server on the given port.
 * </p>
 * </li>
 * <li>
 * <p>
 * After the server is waiting, a client instantiates a Socket object, specifying the server name
 * and port number to connect to.
 * </p>
 * </li>
 * <li>
 * <p>
 * The constructor of the Socket class attempts to connect the client to the specified server and
 * port number. If communication is established, the client now has a Socket object capable of
 * communicating with the server.
 * </p>
 * </li>
 * <li>
 * <p>
 * On the server side, the accept() method returns a reference to a new socket on the server that is
 * connected to the client's socket.
 * </p>
 * </li>
 * </ul>
 * <p>
 * After the connections are established, communication can occur using I/O streams. Each socket has
 * both an OutputStream and an InputStream. The client's OutputStream is connected to the server's
 * InputStream, and the client's InputStream is connected to the server's OutputStream.
 * </p>
 * <p>
 * TCP is a twoway communication protocol, so data can be sent across both streams at the same time.
 * There are following usefull classes providing complete set of methods to implement sockets.
 * </p>
 *
 * <h2>ServerSocket Class Methods:</h2>
 * <p>
 * The <b>java.net.ServerSocket</b> class is used by server applications to obtain a port and listen
 * for client requests
 * </p>
 * <p>
 * The ServerSocket class has four constructors:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public ServerSocket(int port) throws IOException</b><br>
 * Attempts to create a server socket bound to the specified port. An exception occurs if the port
 * is already bound by another application.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public ServerSocket(int port, int backlog) throws IOException</b><br>
 * Similar to the previous constructor, the backlog parameter specifies how many incoming clients to
 * store in a wait queue.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public ServerSocket(int port, int backlog, InetAddress address) throws IOException</b><br>
 * Similar to the previous constructor, the InetAddress parameter specifies the local IP address to
 * bind to. The InetAddress is used for servers that may have multiple IP addresses, allowing the
 * server to specify which of its IP addresses to accept client requests on</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public ServerSocket() throws IOException</b><br>
 * Creates an unbound server socket. When using this constructor, use the bind() method when you are
 * ready to bind the server socket</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * If the ServerSocket constructor does not throw an exception, it means that your application has
 * successfully bound to the specified port and is ready for client requests.
 * </p>
 *
 * <p>
 * Here are some of the common methods of the ServerSocket class:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public int getLocalPort()</b><br>
 * Returns the port that the server socket is listening on. This method is useful if you passed in 0
 * as the port number in a constructor and let the server find a port for you.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public Socket accept() throws IOException</b><br>
 * Waits for an incoming client. This method blocks until either a client connects to the server on
 * the specified port or the socket times out, assuming that the time-out value has been set using
 * the setSoTimeout() method. Otherwise, this method blocks indefinitely</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public void setSoTimeout(int timeout)</b><br>
 * Sets the time-out value for how long the server socket waits for a client during the accept().</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public void bind(SocketAddress host, int backlog)</b><br>
 * Binds the socket to the specified server and port in the SocketAddress object. Use this method if
 * you instantiated the ServerSocket using the no-argument constructor.</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * When the ServerSocket invokes accept(), the method does not return until a client connects. After
 * a client does connect, the ServerSocket creates a new Socket on an unspecified port and returns a
 * reference to this new Socket. A TCP connection now exists between the client and server, and
 * communication can begin.
 * </p>
 *
 * <h2>Socket Class Methods:</h2>
 * <p>
 * The <b>java.net.Socket</b> class represents the socket that both the client and server use to
 * communicate with each other. The client obtains a Socket object by instantiating one, whereas the
 * server obtains a Socket object from the return value of the accept() method.
 * </p>
 * <p>
 * The Socket class has five constructors that a client uses to connect to a server:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public Socket(String host, int port) throws UnknownHostException, IOException.</b><br>
 * This method attempts to connect to the specified server at the specified port. If this
 * constructor does not throw an exception, the connection is successful and the client is connected
 * to the server.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public Socket(InetAddress host, int port) throws IOException</b><br>
 * This method is identical to the previous constructor, except that the host is denoted by an
 * InetAddress object.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public Socket(String host, int port, InetAddress localAddress, int localPort) throws
 * IOException.</b><br>
 * Connects to the specified host and port, creating a socket on the local host at the specified
 * address and port.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public Socket(InetAddress host, int port, InetAddress localAddress, int localPort) throws
 * IOException.</b><br>
 * This method is identical to the previous constructor, except that the host is denoted by an
 * InetAddress object instead of a String</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>public Socket()</b><br>
 * Creates an unconnected socket. Use the connect() method to connect this socket to a server.</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * When the Socket constructor returns, it does not simply instantiate a Socket object but it
 * actually attempts to connect to the specified server and port.
 * </p>
 *
 * <p>
 * Some methods of interest in the Socket class are listed here. Notice that both the client and
 * server have a Socket object, so these methods can be invoked by both the client and server.
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public void connect(SocketAddress host, int timeout) throws IOException</b><br>
 * This method connects the socket to the specified host. This method is needed only when you
 * instantiated the Socket using the no-argument constructor.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public InetAddress getInetAddress()</b><br>
 * This method returns the address of the other computer that this socket is connected to.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public int getPort()</b><br>
 * Returns the port the socket is bound to on the remote machine.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public int getLocalPort()</b><br>
 * Returns the port the socket is bound to on the local machine.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>public SocketAddress getRemoteSocketAddress()</b><br>
 * Returns the address of the remote socket.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>public InputStream getInputStream() throws IOException</b><br>
 * Returns the input stream of the socket. The input stream is connected to the output stream of the
 * remote socket.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>public OutputStream getOutputStream() throws IOException</b><br>
 * Returns the output stream of the socket. The output stream is connected to the input stream of
 * the remote socket</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>public void close() throws IOException</b><br>
 * Closes the socket, which makes this Socket object no longer capable of connecting again to any
 * server</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h2>InetAddress Class Methods:</h2>
 * <p>
 * This class represents an Internet Protocol (IP) address. Here are following usefull methods which
 * you would need while doing socket programming:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>static InetAddress getByAddress(byte[] addr)</b><br>
 * Returns an InetAddress object given the raw IP address .</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>static InetAddress getByAddress(String host, byte[] addr)</b><br>
 * Create an InetAddress based on the provided host name and IP address.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>static InetAddress getByName(String host)</b><br>
 * Determines the IP address of a host, given the host's name.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>String getHostAddress() </b><br>
 * Returns the IP address string in textual presentation.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>String getHostName() </b><br>
 * Gets the host name for this IP address.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>static InetAddress InetAddress getLocalHost()</b><br>
 * Returns the local host.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>String toString()</b><br>
 * Converts this IP address to a String.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h2>URL Processing</h2>
 * <p>
 * URL stands for Uniform Resource Locator and represents a resource on the World Wide Web, such as
 * a Web page or FTP directory.
 * </p>
 * <p>
 * A URL can be broken down into parts, as follows:
 * </p>
 *
 * <pre>
 * <span class="pln">protocol</span><span class="pun">:</span><span class="com">//host:port/path?query#ref</span>
 * </pre>
 * <p>
 * Examples of protocols include HTTP, HTTPS, FTP, and File. The path is also referred to as the
 * filename, and the host is also called the authority.
 * </p>
 * <p>
 * The following is a URL to a Web page whose protocol is HTTP:
 * </p>
 *
 * <pre>
 * <span class="pln">http</span><span class="pun">:</span><span class="com">//www.amrood.com/index.htm?language=en#j2se</span>
 * </pre>
 * <p>
 * Notice that this URL does not specify a port, in which case the default port for the protocol is
 * used. With HTTP, the default port is 80.
 * </p>
 *
 * <h2>URL Class Methods:</h2>
 * <p>
 * The <b>java.net.URL</b> class represents a URL and has complete set of methods to manipulate URL
 * in Java.
 * </p>
 * <p>
 * The URL class has several constructors for creating URLs, including the following:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public URL(String protocol, String host, int port, String file) throws
 * MalformedURLException.</b><br>
 * Creates a URL by putting together the given parts.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public URL(String protocol, String host, String file) throws MalformedURLException</b><br>
 * Identical to the previous constructor, except that the default port for the given protocol is
 * used.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public URL(String url) throws MalformedURLException</b><br>
 * Creates a URL from the given String</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public URL(URL context, String url) throws MalformedURLException</b><br>
 * Creates a URL by parsing the together the URL and String arguments</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * The URL class contains many methods for accessing the various parts of the URL being represented.
 * Some of the methods in the URL class include the following:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>public String getPath()</b><br>
 * Returns the path of the URL.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>public String getQuery()</b><br>
 * Returns the query part of the URL.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>public String getAuthority()</b><br>
 * Returns the authority of the URL.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>public int getPort()</b><br>
 * Returns the port of the URL.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>public int getDefaultPort()</b><br>
 * Returns the default port for the protocol of the URL.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>public String getProtocol()</b><br>
 * Returns the protocol of the URL.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>public String getHost()</b><br>
 * Returns the host of the URL.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>public String getFile()</b><br>
 * Returns the filename of the URL.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>public String getRef()</b><br>
 * Returns the reference part of the URL.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>public URLConnection openConnection() throws IOException</b><br>
 * Opens a connection to the URL, allowing a client to communicate with the resource.</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * <h2>URLConnections Class Methods:</h2>
 * <p>
 * The openConnection() method returns a <b>java.net.URLConnection</b>, an abstract class whose
 * subclasses represent the various types of URL connections.
 * </p>
 * <p>
 * For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you connect to a URL whose protocol is HTTP, the openConnection() method returns an
 * HttpURLConnection object.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you connect to a URL that represents a JAR file, the openConnection() method returns a
 * JarURLConnection object.
 * </p>
 * </li>
 * <li>
 * <p>
 * etc...
 * </p>
 * </li>
 * </ul>
 * <p>
 * The URLConnection class has many methods for setting or determining information about the
 * connection, including the following:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>SN</th>
 * <th>Methods with Description</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td><b>Object getContent() </b><br>
 * Retrieves the contents of this URL connection.</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td><b>Object getContent(Class[] classes) </b><br>
 * Retrieves the contents of this URL connection.</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td><b>String getContentEncoding() </b><br>
 * Returns the value of the content-encoding header field.</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td><b>int getContentLength() </b><br>
 * Returns the value of the content-length header field.</td>
 * </tr>
 * <tr>
 * <td>5</td>
 * <td><b>String getContentType() </b><br>
 * Returns the value of the content-type header field.</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td><b>int getLastModified() </b><br>
 * Returns the value of the last-modified header field.</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td><b>long getExpiration() </b><br>
 * Returns the value of the expires header field.</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td><b>long getIfModifiedSince() </b><br>
 * Returns the value of this object's ifModifiedSince field.</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td><b>public void setDoInput(boolean input)</b><br>
 * Passes in true to denote that the connection will be used for input. The default value is true
 * because clients typically read from a URLConnection.</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td><b>public void setDoOutput(boolean output)</b><br>
 * Passes in true to denote that the connection will be used for output. The default value is false
 * because many types of URLs do not support being written to.</td>
 * </tr>
 * <tr>
 * <td>11</td>
 * <td><b>public InputStream getInputStream() throws IOException</b><br>
 * Returns the input stream of the URL connection for reading from the resource.</td>
 * </tr>
 * <tr>
 * <td>12</td>
 * <td><b>public OutputStream getOutputStream() throws IOException</b><br>
 * Returns the output stream of the URL connection for writing to the resource</td>
 * </tr>
 * <tr>
 * <td>13</td>
 * <td><b>public URL getURL()</b><br>
 * Returns the URL that this URLConnection object is connected to</td>
 * </tr>
 * </tbody>
 * </table>
 */
package tutorialspoint.networking;