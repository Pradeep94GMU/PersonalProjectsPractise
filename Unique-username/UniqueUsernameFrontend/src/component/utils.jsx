export const formatNumber = (num) => {
  if (num === null || num === undefined) return "0";
  const si = [
      { value: 1e9, symbol: "B" },
      { value: 1e6, symbol: "M" },
      { value: 1e3, symbol: "K" },
  ];
  for (let i = 0; i < si.length; i++) {
      if (num >= si[i].value) {
          return (num / si[i].value).toFixed(1) + si[i].symbol;
      }
  }
  return num.toString();
};
