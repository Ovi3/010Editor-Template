

import java.io.*;

public class CasesGenerator {
    public static void main(String[] args) throws IOException {
        generatePrimitiveTypeTest("./c_primitiveType.ser");
        generatePrimitiveTypeArrayTest("./c_primitiveTypeArray.ser");
    }

    public static void generatePrimitiveTypeTest(String outputPath) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputPath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new PrimitiveTypeTest());
        oos.close();
        fos.close();
    }

    static class PrimitiveTypeTest implements Serializable {
        public byte b;
        public char c;
        public double d;
        public float f;
        public int i;
        public long l;
        public short s;
        public boolean bool;
        public boolean bool2;

        public PrimitiveTypeTest(){
            b = 0x30;
            c = 'C';
            d = 913.22223;
            f = (float) -99.22;
            i = 10000;
            l = 8670450532247928831L;
            s = 9901;
            bool = false;
            bool2 = true;

        }
    }


    public static void generatePrimitiveTypeArrayTest(String outputPath) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputPath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new PrimitiveTypeArrayTest());
        oos.close();
        fos.close();
    }

    static class PrimitiveTypeArrayTest implements Serializable {
        public byte[] b;
        public char[] c;
        public double[] d;
        public float[] f;
        public int[] i;
        public long[] l;
        public short[] s;
        public boolean[] bool;

        public PrimitiveTypeArrayTest(){
            b = new byte[]{0x31, 0x32, 0x33, 0x34, 0x35};
            c = new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'A'};
            d = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
            f = new float[]{0.3f, -1.5f, 3.6f};
            i = new int[]{99999, 88888, 77777};
            l = new long[]{8670450532247928831L, 8888888888L};
            s = new short[]{9901, 8802};
            bool = new boolean[]{false, true, false};

        }
    }
}