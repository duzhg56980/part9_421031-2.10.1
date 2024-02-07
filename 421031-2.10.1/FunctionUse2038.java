import org.apache.hadoop.io.nativeio.NativeIO.POSIX;
public class FunctionUse2038 {
public void funcUse() {
POSIX posix = new POSIX();
posix.getName(null,null);
}
}